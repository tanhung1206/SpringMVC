package tan.hung.controller;

import jakarta.servlet.ServletContext;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import tan.hung.domain.User;
import tan.hung.exception.UserNotFoundException;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    ServletContext servletContext;

    @ModelAttribute("roles")
    private Map<String, String> populateRoles() {
        Map<String, String> roleMap = new HashMap<>();
        roleMap.put("Admin", "Admin");
        roleMap.put("DBA", "DBA");
        return roleMap;
    }

    @GetMapping("/add")
    public String getUserForm(@ModelAttribute("newUser") User user, Model model) {
        return "userForm";
    }

    @PostMapping("/add")
    public String setUser(@Valid @ModelAttribute("newUser") User user, BindingResult bindingResult, RedirectAttributes redirectAttributes) {//BindingResult phai dat ngay sau @Valid @ModelAttribute
        //save to db
        System.out.println("go here");
        if (bindingResult.hasErrors()) {
            return "userForm";
        }
        MultipartFile multiPartFile = user.getProfileImage();
        if (multiPartFile != null || !multiPartFile.isEmpty()) {
            String fileName = servletContext.getRealPath("/") + "resources\\images\\" + multiPartFile.getOriginalFilename();
            System.out.println(fileName);
            try {
                multiPartFile.transferTo(new File(fileName));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        redirectAttributes.addFlashAttribute("savedUser", user);
        return "redirect:/user/userDetails";
    }

    @GetMapping("/userDetails")
    public String success() {
        return "success";
    }

    @GetMapping("/get")
    public String retrieveUser(@RequestParam(value = "email", required = false, defaultValue = "") String email, Model model) {
        if (!"".equals(email)) {
            User user = new User();
            user.setName("Hung");
            user.setEmail("tanhung126612@gmail.com");
            model.addAttribute("savedUser", user);
            return "forward:/user/userDetails";
        } else {
            throw new UserNotFoundException("User Not Found");
        }
    }

//    @ExceptionHandler(UserNotFoundException.class)
//    public String handleUserNotFoundException(UserNotFoundException e, Model model) {
//        model.addAttribute("msg", e.getMessage());
//        return "error";
//    }
}

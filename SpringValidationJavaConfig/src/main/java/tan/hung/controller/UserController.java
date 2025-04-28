package tan.hung.controller;

import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import tan.hung.domain.User;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/user")
public class UserController {
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
        if (bindingResult.hasErrors()) {
            return "userForm";
        }
        redirectAttributes.addFlashAttribute("savedUser", user);
        return "redirect:/user/userDetails";
    }

    @GetMapping("/userDetails")
    public String success() {
        return "success";
    }
}

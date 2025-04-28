package tan.hung.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import tan.hung.exception.UserNotFoundException;

@Controller
public class HomeController {
    @GetMapping("/")
    public String index() {
        return "redirect:/user/add";
    }

    @GetMapping("/user/retrieve")
    public String fakeGetUser() {
        throw new UserNotFoundException("This is a practice...");
    }
    @GetMapping("/error")
    public String error() throws Exception {
        throw new Exception("This is an exception...");
    }
}

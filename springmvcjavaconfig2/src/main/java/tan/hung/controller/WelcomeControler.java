package tan.hung.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeControler {
    @RequestMapping("/welcome")
    public String welcome() {
        return "welcome";
    }
}

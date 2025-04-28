package tan.hung;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import tan.hung.model.User;

@Controller
@RequestMapping("/user")
public class SignUpController {

    //    @RequestMapping(value = "/signup", method = RequestMethod.GET)
    @GetMapping("/signup")
    public String getSignUpForm() {
        return "SignUpForm";
    }

    //    @RequestMapping(value = "/signup", method = RequestMethod.POST)
    @PostMapping("/signup")
    public String saveUser(User user) {
        System.out.println(user);
        return "result";
    }
}

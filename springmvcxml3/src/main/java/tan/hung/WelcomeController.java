package tan.hung;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {
    @RequestMapping("/welcome")
    public String welcome() {
//        return "/WEB-INF/jsp/welcome.jsp";
        return "welcome";
    }
}

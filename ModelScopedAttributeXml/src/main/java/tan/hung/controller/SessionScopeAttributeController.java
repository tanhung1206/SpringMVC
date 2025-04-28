package tan.hung.controller;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

@Controller
@RequestMapping("/session")
@SessionAttributes({"channelName", "hello"})
public class SessionScopeAttributeController {
    @GetMapping({"/", ""})
    public String setSessionAttribute(Model model, HttpSession session) {
        model.addAttribute("channelName", "tanhung1206");
        model.addAttribute("hello", "Hello world");
        session.setAttribute("authorName", "Nguyen Tan Hung");
        session.setAttribute("channelName", "Thank you..."); //session duoc tao truoc
        return "redirect:/session/display";
//        System.out.println(session.getAttribute("channelName"));
//        return "forward:/session/display";
    }

    @GetMapping("/display")
    public String display(HttpSession session,SessionStatus sessionStatus) {
        //only remove attribute set by using @SessionAttribute
        //it removes attribute from session scope after the page rendering
        sessionStatus.setComplete();

//        System.out.println(session.getAttribute("channelName"));
        return "sessionScopedAttribute";
    }
}

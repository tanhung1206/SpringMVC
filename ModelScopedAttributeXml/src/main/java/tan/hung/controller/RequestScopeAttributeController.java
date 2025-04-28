package tan.hung.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import tan.hung.model.Customer;

@Controller
public class RequestScopeAttributeController {
    @GetMapping("/")
    public String requestAttribute(Model model, HttpServletRequest request) {
        model.addAttribute("channelName", "Tan Hung");
        model.addAttribute("year", "2017");
        Customer customer = new Customer(1, "Hung");
        model.addAttribute("cus", customer);
        request.setAttribute("authorName", "Nguyen Tan Hung");
        return "redirect:/display";
    }

    @GetMapping("/display")
    public String displayRequestAttribute() {
        return "requestScopeAttribute";
    }
}

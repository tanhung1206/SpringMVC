package tan.hung.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import tan.hung.model.Order;

@Controller
public class OrderController {
    @GetMapping("/")
    public String orderForm(@ModelAttribute("order") Order order) {
        return "orderForm";
    }

    @PostMapping("/saveOrder")
    public String saveOrder(Order myOrder, RedirectAttributes redirectAttributes) {
        System.out.println("Save order to db");

//        redirectAttributes.addFlashAttribute("placedOrder", order);
        redirectAttributes.addFlashAttribute(myOrder);// ten mac dinh de truy xuat(Ten class Order -> chu cai dau viet thuong -> order
//        return "thankyou";
//        System.out.println(order);
        return "redirect:/success";
    }

    @GetMapping("/success")
    public String success() {
        return "thankyou";
    }
}

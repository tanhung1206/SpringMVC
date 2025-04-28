package tan.hung.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import tan.hung.model.Customer;
import tan.hung.model.Phone;

@Controller
public class CustomerController {
    @GetMapping("/")
    public String getCustomerForm() {
        return "customerForm";
    }

    @PostMapping("/saveCustomer")
    public String saveCustomer(Customer customer) {
        //save to DB
        return "customerDetail";
    }

    @GetMapping("/edit")
    public String editCustomer(Model model) {
        Phone phone = new Phone("123", "456", "789");
        Customer customer = new Customer("tan", "hung", phone);
        model.addAttribute("customer", customer);
        return "customerEditForm";
    }

}

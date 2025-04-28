package tan.hung.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import tan.hung.model.Country;
import tan.hung.model.Customer;
import tan.hung.model.Phone;
import tan.hung.model.User;

import java.util.*;

@Controller
public class CustomerController {
    @GetMapping("/test")
    public String test(User user){
        System.out.println(user);
        return "test";
    }
    @GetMapping("/")
    public String getCustomerForm( Customer customer, Model model) {
//        List<String> countryList = Arrays.asList("Viet Nam", "Singapore", "Nhat Ban");
//        Map<String, String> countryList = new HashMap<>();
//        countryList.put("vn", "Viet Nam");
//        countryList.put("sgp", "Singapore");
//        countryList.put("jp", "Nhat Ban");

        List<Country> countryObjList = Arrays.asList(
                new Country("vn", "Viet Nam"),
                new Country("sgp", "Singapore"),
                new Country("jp", "Nhat Ban")
        );

        model.addAttribute("countryObjList", countryObjList);
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

    @GetMapping("/editCustomer")
    public String editCustomer2(Model model) {
        Phone phone = new Phone("111", "222", "333");
        Customer customer = new Customer("tan", "hung", phone);
        model.addAttribute("customer", customer);
        List<Country> countryObjList = Arrays.asList(
                new Country("vn", "Viet Nam"),
                new Country("sgp", "Singapore"),
                new Country("jp", "Nhat Ban")
        );

        model.addAttribute("countryObjList", countryObjList);
        return "customerForm";
    }

}

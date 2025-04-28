package tan.hung;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/product")
public class ProductController {
    @GetMapping("/listProducts")
    public String getProductByCategory(@RequestParam(value = "categoryId") Integer categoryId, @RequestParam(value = "categoryName", required = false, defaultValue = "") String name) {
        System.out.println("Id: " + categoryId);
        System.out.println("Name: " + name);
        return "welcome";
    }

    @GetMapping("categoryId/{categoryId}/categoryName/{categoryName}")
    public String getProducts(@PathVariable("categoryId") String categoryId, @PathVariable("categoryName") String categoryName) {
        System.out.println("Id: " + categoryId);
        System.out.println("Name: " + categoryName);
        return "welcome";
    }

    @PostMapping("/save")
    public String saveProduct() {
        return "welcome";
    }
}

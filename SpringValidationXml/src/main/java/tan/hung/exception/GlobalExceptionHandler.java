package tan.hung.exception;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;

@ControllerAdvice(basePackages = "tan.hung.controller")
public class GlobalExceptionHandler {

    @ModelAttribute("channel")
    public String channelName() {
        return "tanhung1206";
    }

    @ExceptionHandler(UserNotFoundException.class)
    public String handleUserNotFoundException(UserNotFoundException e, Model model) {
        model.addAttribute("msg", e.getMessage());
        return "error";
    }

    @ExceptionHandler(Exception.class)
    public String handleException(Exception e, Model m) {
        m.addAttribute("msg", e.getMessage());
        return "error";
    }
}

package training360.employeewebapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDateTime;
import java.util.Map;

@Controller
public class EmployeeController {

    @GetMapping("/")
    public ModelAndView sayHello() {

        return new ModelAndView("employees",
                Map.of("now", LocalDateTime.now()));
    }
}
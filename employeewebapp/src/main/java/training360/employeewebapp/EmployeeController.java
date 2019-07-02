package training360.employeewebapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDateTime;
import java.util.Map;

@Controller
public class EmployeeController {

    private EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/")
    public ModelAndView listEmployees() {

        return new ModelAndView("employees",
                Map.of("now", LocalDateTime.now(),
                        "employees", employeeService.listEmployeeNames()));
    }

    @PostMapping("/")
    public String createEmployee(HttpServletRequest request)  {
        employeeService.createEmployee(request.getParameter("name"));
        return "redirect:/";
    }
}

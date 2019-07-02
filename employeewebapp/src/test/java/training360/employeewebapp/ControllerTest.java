package training360.employeewebapp;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;

import java.util.List;

import static org.junit.Assert.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest
@Sql(statements = "delete from employee")
public class ControllerTest {

    @Autowired
    EmployeeController employeeController;

    @Test
    public void testSaveThenList() {
        var mock = new MockHttpServletRequest();
        mock.setParameter("name", "John Doe");

        employeeController.createEmployee(mock);
        var modelAndView = employeeController.listEmployees();
        List<String> names = (List) modelAndView.getModel().get("employees");
        assertTrue(names.contains("john doe"));
    }
}


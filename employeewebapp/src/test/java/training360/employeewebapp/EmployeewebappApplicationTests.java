package training360.employeewebapp;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeewebappApplicationTests {

	@Autowired
	EmployeeService employeeService;

	@Test
	public void testSaveThenList() {
		employeeService.createEmployee("Test User 1");

		var names = employeeService.listEmployeeNames();

		assertTrue(names.contains("Test User 1"));
	}

}

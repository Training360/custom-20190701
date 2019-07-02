package training360.employeewebapp;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest
//@Sql(statements = "delete from employee")
public class EmployeewebappApplicationTests {

	@Autowired
	EmployeeService employeeService;

	@Test
	public void testSaveThenList() {
		var size = employeeService.listEmployeeNames().size();

			employeeService.createEmployee("Test User 1");

		var names = employeeService.listEmployeeNames();

		assertEquals(size + 1, names.size());
		assertTrue(names.contains("test user 1"));

//		employeeService.deleteEmployee("Test User 1");
	}

}

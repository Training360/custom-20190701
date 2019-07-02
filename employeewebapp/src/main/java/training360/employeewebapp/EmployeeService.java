package training360.employeewebapp;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {

    private EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public List<String> listEmployeeNames() {
        var employeeNames = employeeRepository.listEmployeeNames();
        List<String> lowercaseNames = new ArrayList<>();
        for (String name: employeeNames) {
            lowercaseNames.add(new NameConverter().convertName(name));
        }
        return lowercaseNames;
    }

    public void createEmployee(String name) {
        employeeRepository.createEmployee(name);
    }
}

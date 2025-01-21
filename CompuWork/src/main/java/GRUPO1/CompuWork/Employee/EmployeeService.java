package GRUPO1.CompuWork.Employee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public Employee getEmployee(Long id) {
        return employeeRepository.findById(id).orElseThrow();
    }

    public Employee updateEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public void deleteEmployeeById(Long id) {
        employeeRepository.deleteById(id);
    }

    public Employee createEmployee(Employee employee) {
        throw new UnsupportedOperationException("Unimplemented method 'createEmployee'");
    }

    public Object getEmployeeById(String id) {
        throw new UnsupportedOperationException("Unimplemented method 'getEmployeeById'");
    }

    public void saveEmployee(Employee employee) {
        throw new UnsupportedOperationException("Unimplemented method 'saveEmployee'");
    }
}
    


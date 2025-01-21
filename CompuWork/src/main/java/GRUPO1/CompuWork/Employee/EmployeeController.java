// package GRUPO1.CompuWork.Employee;

package GRUPO1.CompuWork.Employee;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class EmployeeController {
    
    @Value("${employee.1.id}")
    private int employee1Id;
    
    @Value("${employee.1.nombre}")
    private String employee1Nombre;
    
    @Value("${employee.1.department}")
    private String employee1Department;
    
    @Value("${employee.1.apellido}")
    private String employee1Apellido;
    
    @Value("${employee.1.correo}")
    private String employee1Correo;
    
    @Value("${employee.1.telefono}")
    private String employee1Telefono;
    
    @Value("${employee.2.id}")
    private int employee2Id;
    
    @Value("${employee.2.nombre}")
    private String employee2Nombre;
    
    @Value("${employee.2.department}")
    private String employee2Department;
    
    @Value("${employee.2.apellido}")
    private String employee2Apellido;
    
    @Value("${employee.2.correo}")
    private String employee2Correo;
    
    @Value("${employee.2.telefono}")
    private String employee2Telefono;
    
    @GetMapping("/employees")
    public List<Employee> getEmployees() {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(employee1Id, employee1Nombre, employee1Department, employee1Apellido, employee1Correo, employee1Telefono));
        employees.add(new Employee(employee2Id, employee2Nombre, employee2Department, employee2Apellido, employee2Correo, employee2Telefono));
        return employees;
    }
}
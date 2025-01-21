package GRUPO1.CompuWork.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import GRUPO1.CompuWork.Employee.Employee;
import GRUPO1.CompuWork.Employee.EmployeeService;
import GRUPO1.CompuWork.services.DepartmentService;


@RequestMapping("/CompuWork")
public class Controller {
    

    @Autowired
    private EmployeeService employeeService;
    @Autowired
    private DepartmentService departmentService;
    public DepartmentService getDepartmentService() {
        return departmentService;
    }

    public void setDepartmentService(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @Autowired
    private ReportService reportService;

    public ReportService getReportService() {
        return reportService;
    }

    public void setReportService(ReportService reportService) {
        this.reportService = reportService;
    }

    @GetMapping("/employees")
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    @GetMapping("/employee/{id}")
    public Employee getEmployee(@PathVariable Long id) {
        return employeeService.getEmployee(id);
    }

    @PostMapping("/employees")
    public Employee creaEmployee(@RequestBody Employee employee) {
        return ((EmployeeService) employeeService).createEmployee(employee);
    }

    @PutMapping("/employee/{id}")
    public Employee updatEmployee(@PathVariable Long id, @RequestBody Employee employee) {
        return employeeService.updateEmployee(employee);
    }

    @DeleteMapping("/employees/{id}")
    public void deleteEmployee(@PathVariable Long id) {
        employeeService.deleteEmployeeById(id);
    }
     
    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("employees", employeeService.getAllEmployees());
        return "index";
    }

    @Override
    public String toString() {
        return "Controller{" +
                "employeeService=" + employeeService +
                ", departmentService=" + departmentService +
                ", reportService=" + reportService +
                '}';
    }

    public EmployeeService getEmployeeService() {
        return employeeService;
    }

    public void setEmployeeService(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }
    
}

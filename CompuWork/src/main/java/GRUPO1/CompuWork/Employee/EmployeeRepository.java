package GRUPO1.CompuWork.Employee;

 import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import GRUPO1.CompuWork.models.Department;

 @SuppressWarnings({ "Employee", "unused" })
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    // List<Employee> findByDepartmentId(Long departmentId);
    List<Employee> findAll();
 }
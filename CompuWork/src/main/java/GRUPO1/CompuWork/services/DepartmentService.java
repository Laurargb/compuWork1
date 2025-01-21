package GRUPO1.CompuWork.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;
    private DepartmentRepository departmentDepartment;

    public List<Department> getAllDepartments(){ 
        return departmentRepository.findAll();
    }

    public Department createDepartment(Department department){
        return departmentRepository.save(department);
    }

    public Department updateDepartment(Department department) {
        return departmentDepartment.save(department);
    }

    public void deleteDepartment(Long id) {
        departmentRepository.deleteById(id);
    }
}

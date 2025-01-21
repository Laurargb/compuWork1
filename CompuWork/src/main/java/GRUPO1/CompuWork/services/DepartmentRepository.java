package GRUPO1.CompuWork.services;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@SuppressWarnings("unused")
@Repository
public interface DepartmentRepository {
    @Query("SELECT d FROM Department d")
    List<Department> findAllDepartments();

    List<Department> findAll();

    Department save(Department department);

    void deleteById(Long id);
}

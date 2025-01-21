// package GRUPO1.CompuWork.services;

// import java.sql.Connection;
// import java.beans.Statement;
// import java.sql.DriverManager;
// import java.sql.ResultSet;
// import java.util.ArrayList;
// import java.util.List;


// public class EmployeeRepository {

//     public List<Department> findAll() {
//         Connection conn = (Connection) DriverManager.getConnection("url", "username", "password");
//     Statement stmt = conn.createStatement();
//     ResultSet rs = stmt.executeQuery("SELECT * FROM departments");
//     List<Department> departments = new ArrayList<>();
//     while (rs.next()) {
//         Department department = new Department(rs.getLong("id"), rs.getString("name"));
//         departments.add(department);
//     }
//     return departments;
// }

//     public Department save(Department department) {
//         Session session = HibernateUtil.getSessionFactory().getCurrentSession();
//     session.beginTransaction();
//     session.saveOrUpdate(department);
//     session.getTransaction().commit();
//     return department;
// }
//     }

//     public void deleteById(Long id) {
//         Department department = entityManager.find(Department.class, id);
//     if (department != null) {
//         entityManager.remove(department);
//     }

// }

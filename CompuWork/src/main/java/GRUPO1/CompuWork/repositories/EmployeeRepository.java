 package GRUPO1.CompuWork.repositories;

 import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
 import java.sql.ResultSet;
 import java.sql.SQLException;
 import java.util.ArrayList;
 import java.util.List;

import GRUPO1.CompuWork.Employee.Employee;

 /**
  * Repositorio de empleados.
  */
 public class EmployeeRepository {

     private ResultSet rs;

     /**
      * Obtiene todos los empleados.
      * @param jdbc 
     * @param auto 
      *
      * @return lista de empleados
      *

     /**
      * @return
     * @throws SQLException 
      */
     public List<Employee> findAll(Object jdbc, Object auto) throws SQLException {
         List<Employee> empleados = new ArrayList<>();

         while (rs.next()) {
            Employee empleado = new Employee(
                rs.getString("nombre"), 
                rs.getString("department"), 
                rs.getString("apellido")
            );
            // empleado.setId(rs.getString("id"));
            empleado.setCorreo(rs.getString("correo"));
            empleado.setTelefono(rs.getString("telefono"));
            empleados.add(empleado);
        }

         return empleados;
     }
 
   

     @Override
     public String toString() {
         return "EmployeeRepository []";
     }


     public Employee findById(String id) {
    Employee empleado = null;
    try (BufferedReader reader = new BufferedReader(new FileReader("employees.txt"))) {
        String line;
        while ((line = reader.readLine()) != null) {
            String[] fields = line.split(",");
            if (fields[0].equals(id)) {
                empleado = new Employee(fields[1], fields[2], fields[3]);
                // empleado.setId(fields[0]);
                empleado.setCorreo(fields[4]);
                empleado.setTelefono(fields[5]);
                break;
            }
        }
    } catch (IOException e) {
        // Maneja la excepción
        System.out.println("Error al leer archivo: " + e.getMessage());
    }
    return empleado;
}
   

     /**
      * Guarda un empleado.
      *
      * @param empleado empleado a guardar
      */
     public void save(Employee empleado) {
    try (BufferedWriter writer = new BufferedWriter(new FileWriter("employees.txt", true))) {
        writer.write(empleado + "," + empleado.id + "," + empleado.getDepartment() + "," + empleado.id + "," + empleado.id + "," + empleado.telefono + "\n");
    } catch (IOException e) {
        // Maneja la excepción
        System.out.println("Error al escribir archivo: " + e.getMessage());
    }
}

     /**
      * Elimina un empleado por su ID.
      *
      * @param id ID del empleado a eliminar
      */
      public void deleteById(String id) {
        try (BufferedReader reader = new BufferedReader(new FileReader("employees.txt"))) {
            List<String> lines = new ArrayList<>();
            String line;
            while ((line = reader.readLine()) != null) {
                if (!line.startsWith(id + ",")) {
                    lines.add(line);
                }
            }
            try (BufferedWriter writer = new BufferedWriter(new FileWriter("employees.txt"))) {
                for (String lineToWrite : lines) {
                    writer.write(lineToWrite + "\n");
                }
            }
        } catch (IOException e) {
            // Maneja la excepción
            System.out.println("Error al leer o escribir archivo: " + e.getMessage());
        }
    }
 }
  
  
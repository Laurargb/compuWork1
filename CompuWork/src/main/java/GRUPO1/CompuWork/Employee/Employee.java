package GRUPO1.CompuWork.Employee;

import GRUPO1.CompuWork.repositories.PerformanceReport;
// import jakarta.persistence.Entity;
// import jakarta.persistence.GeneratedValue;
// import jakarta.persistence.GenerationType;
// import jakarta.persistence.Id;

public class Employee {
    
    @SuppressWarnings("int")
    public String id;
    
    @SuppressWarnings("unused")
    private String nombre;
    
    private String department;
    
    private String apellido;
    
    private String correo;
    
    public String telefono;
    
    public Employee(int employee1Id, String nombre, String department, String apellido, String correo, String telefono) {
        this.id = String.valueOf(employee1Id);
        this.nombre = nombre;
        this.department = department;
        this.apellido = apellido;
        this.correo = correo;
        this.telefono = telefono;
    }
    
    // geters and setters



    public Employee(String string, String string2, String string3) {
        
    }

   

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public PerformanceReport generateIndividualPerformanceReport(Employee employee) {
        // Implement the logic for generating the performance report
        return null;
    }

    // public void setId(int string) {
    //     this.id = string;
    //     throw new UnsupportedOperationException("Unimplemented method 'setId'");
    // }

    // public String getId(int i) {
    //     extracted();
    //     throw new UnsupportedOperationException("Unimplemented method 'getId'");
    // }

    // private String extracted() {
    //     return this.id = id;
    // }

	

    // public void setId(int i) {
    //     extracted();
    //     throw new UnsupportedOperationException("Unimplemented method 'setId'");
    // }

    // private String extracted(int id) {
    //     return this.id = id;
    // }
}

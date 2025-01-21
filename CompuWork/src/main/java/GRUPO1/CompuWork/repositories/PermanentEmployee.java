package GRUPO1.CompuWork.repositories;

import GRUPO1.CompuWork.models.Employee;

public class PermanentEmployee extends Employee {

    private static String apellido;
    @SuppressWarnings("unused")
    private double performanceScore;

    /**
     * @param employee
     * @param performanceScore
     */
    public PermanentEmployee(Employee employee, double performanceScore) {
        // Call the constructor of the Employee class
        super(employee.getId(), employee.getName(), employee.getDepartment(), apellido);
        this.performanceScore = performanceScore;
    }

    @Override
    public void updateEmployeeRecord(String newName, String newDepartment) {
        setName(newName);
        setDepartment(newDepartment);
    }

    // Puedes agregar métodos adicionales aquí si es necesario
}



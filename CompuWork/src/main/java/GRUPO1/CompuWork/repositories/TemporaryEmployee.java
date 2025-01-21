package GRUPO1.CompuWork.repositories;

import GRUPO1.CompuWork.models.Employee; // Asegúrate de que esta importación sea correcta

public class TemporaryEmployee extends Employee {
    private int contractDuration;

    public TemporaryEmployee(int id, String name, String department, int contractDuration) {
        super(id, name, department, department); // Asumiendo que estos son los parámetros correctos para Employee
        this.contractDuration = contractDuration;
    }

    public int getContractDuration() {
        return contractDuration;
    }

    public void updateEmployeeRecord(String newName, String newDepartment) {
        setName(newName); // Asegúrate de que estos métodos existan en Employee
        setDepartment(newDepartment);
    }

    public static void main(String[] args) {
        // Código de prueba para demostrar el uso de la clase TemporaryEmployee
        TemporaryEmployee tempEmployee = new TemporaryEmployee(1, "John Doe", "IT", 6);
        tempEmployee.updateEmployeeRecord("Jane Doe", "HR");
        System.out.println("Contract duration: " + tempEmployee.getContractDuration());
        System.out.println("Name: " + tempEmployee.getName());
        System.out.println("Department: " + tempEmployee.getDepartment());
    }
}
package GRUPO1.CompuWork.repositories;

import GRUPO1.CompuWork.Employee.Employee;

public class PerformanceReport {
    private static final double PuntuacionDesempeno = 0;
    private Employee employee;
    private double performanceScore;
    public PerformanceReport(Employee employee, double         performanceScore) {
    this.employee = employee;
    this.performanceScore = performanceScore;
    }
    public Employee getEmployee() {
    return employee;
    }
    public double getPerformanceScore() {
    return performanceScore;
    }
    public double getPuntuacionDesempeno() {
        return PuntuacionDesempeno;
    }
  }

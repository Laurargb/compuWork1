package GRUPO1.CompuWork.repositories;

// Asegúrate de que estas importaciones sean correctas y existan en tu proyecto
import GRUPO1.CompuWork.models.Employee;

public class ReportGenerator {
    private static final double PERMANENT_EMPLOYEE_SCORE = 0.8;
    private static final double TEMPORARY_EMPLOYEE_SCORE = 0.6;
    private static final double DEFAULT_SCORE = 0.0;

    /**
     * Genera un informe de desempeño individual para el empleado dado.
     *
     * @param employee el empleado para el que se genera el informe
     * @return el informe de desempeño
     */
    public PermanentEmployee generateIndividualPerformanceReport(final Employee employee) {
        double performanceScore;
        if (employee instanceof PermanentEmployee) {
            performanceScore = PERMANENT_EMPLOYEE_SCORE;
        } else if (employee instanceof TemporaryEmployee) {
            performanceScore = TEMPORARY_EMPLOYEE_SCORE;
        } else {
            performanceScore = DEFAULT_SCORE;
        }
        return new PermanentEmployee(employee, performanceScore);
    }

    @Override
    public String toString() {
        return "ReportGenerator []";
    }
}

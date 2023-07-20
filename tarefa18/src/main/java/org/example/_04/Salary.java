package org.example._04;

public class Salary {
    public void employeeMethod(Employee employee) {
        // Some actions
        double yearlySalary = employee.getYearlySalary();
        double awards = employee.getAwards();
        double monthlySalary = getMonthlySalary(yearlySalary, awards);
        // Continue processing
    }

    public double getMonthlySalary(double yearlySalary, double awards) {
        return (yearlySalary + awards)/12;
    }
}

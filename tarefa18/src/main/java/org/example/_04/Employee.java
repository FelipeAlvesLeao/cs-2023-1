package org.example._04;

public class Employee {

    double salary;

    double awards;
    public void employeeMethod(Employee employee) {
        // Some actions
        double monthlySalary = getMonthlySalary(employee);
        // Continue processing
    }

    public double getYearlySalary(){
        return salary*12;
    }

    public double getAwards(){
        return awards;
    }

    public double getMonthlySalary(Employee employee) {
    return (employee.getYearlySalary() + employee.getAwards())/12;
    }
}

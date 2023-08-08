package com.java2.project;

public class Waiter extends Employee {
    
    private double tips;

    public Waiter(int employeeId, String firstName, String lastName, int age, double wagePerHour, int workedHours, EmployeeType type, boolean admin, double tips) {
        super(employeeId, firstName, lastName, age, wagePerHour, workedHours, type, admin);
        this.tips = tips;
    }

    @Override
    public double calculateMonthlyWage() {
        return super.calculateMonthlyWage() + this.tips;
    }
     
}

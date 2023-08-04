package com.java2.project;

import java.io.Serializable;

public class Employee implements Serializable{
    
    private double employeeId;
    private String firstName;
    private String lastName;
    private int age;
    private double wagePerHour;
    private int workedHours;
    private EmployeeType type;
    private boolean admin;

    public Employee() {
    }
    
    public Employee(double employeeId, String firstName, String lastName, int age, double wagePerHour, int workedHours, EmployeeType type, boolean admin) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.wagePerHour = wagePerHour;
        this.workedHours = workedHours;
        this.type = type;
        this.admin = admin;
    }

    public double getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(double employeeId) {
        this.employeeId = employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWagePerHour() {
        return wagePerHour;
    }

    public void setWagePerHour(double wagePerHour) {
        this.wagePerHour = wagePerHour;
    }

    public int getWorkedHours() {
        return workedHours;
    }

    public void setWorkedHours(int workedHours) {
        this.workedHours = workedHours;
    }

    public EmployeeType getType() {
        return type;
    }

    public void setType(EmployeeType type) {
        this.type = type;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }
    
    public double calculateMonthlyWage() {
        return this.wagePerHour * workedHours;
    }
}

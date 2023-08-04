package com.java2.project;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class RestaurantModel {
    
    public void createEmployeeFile(Employee employee){
        ObjectOutputStream outputStream = null;
        try {
            outputStream = new ObjectOutputStream(new FileOutputStream(employee.getEmployeeId()+".dat"));
            outputStream.writeObject(employee);
            outputStream.close();
	} catch(IOException e) {
            System.out.println(e);
	}
    }
    
    public Employee readEmployeeFile(String employeeId){
        ObjectInputStream inputStream = null;
        Employee employee = null;
        try{
            inputStream = new ObjectInputStream(new FileInputStream(employeeId+".dat"));
            employee = (Employee)inputStream.readObject();
            System.out.println(employee);
	} catch(Exception e){
            System.out.println("Error reading objects"+e);
	}finally{
            try{
		inputStream.close();
            }catch(Exception e){
		System.out.println("Error closing");
            }
	}
        return employee;
    }
    
    public boolean deleteEmployee(Employee employee) {
        File employeeFile = new File(employee.getEmployeeId() + ".dat");
        return employeeFile.delete();
    }
    
    public Employee createEmployee(double employeeId, String firstName, String lastName, int age, double wage, int hours, EmployeeType type, boolean admin) {
        Employee employee = new Employee(employeeId, firstName, lastName, age, wage, hours, type, admin);
        return employee;
    }
}

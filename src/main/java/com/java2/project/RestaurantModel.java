package com.java2.project;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class RestaurantModel {
    
    private final String FILES_PATH = "C:/Users/threa/OneDrive/Documentos/Sheridan/Semester2/OOP2/Programs/Java2Project/employees";
    private int ID = 0;
    
    public RestaurantModel(){
        EmployeeList employees = readAllEmployeeFiles();
        if(!employees.isEmpty()){
            for(Employee e: employees){
                if(ID < e.getEmployeeId())
                    ID = e.getEmployeeId();
            }
        }
    }
    
    public void createEmployeeFile(Employee employee){
        ObjectOutputStream outputStream = null;
        try {
            outputStream = new ObjectOutputStream(new FileOutputStream(FILES_PATH + "/" + employee.getEmployeeId()+".dat"));
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
            inputStream = new ObjectInputStream(new FileInputStream(FILES_PATH + "/" + employeeId+".dat"));
            employee = (Employee)inputStream.readObject();
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
    
    public final EmployeeList readAllEmployeeFiles() {
        EmployeeList employees = new EmployeeList();
        File directory = new File(FILES_PATH);
        File employeesFiles[] = directory.listFiles();
        for(File employee: employeesFiles) {
            employees.add(readEmployeeFile(employee.getName().substring(0, employee.getName().length() - 4)));
        }
        return employees;
    }
    
    public boolean deleteEmployeeFile(Employee employee) {
        File employeeFile = new File(FILES_PATH + "/" + employee.getEmployeeId() + ".dat");
        return employeeFile.delete();
    }
    
    public Employee createEmployee(String firstName, String lastName, int age, double wage, int hours, EmployeeType type, boolean admin) {
        Employee employee = new Employee(++ID, firstName, lastName, age, wage, hours, type, admin);
        return employee;
    }
}

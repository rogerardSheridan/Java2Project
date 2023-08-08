package com.java2.project;

public class TestEmployee {
    public static void main(String args[]){
        RestaurantModel model = new RestaurantModel();
        Employee gerardo = model.createEmployee(1, "Gerardo", "Rodriguez", 27, 30, 40, EmployeeType.MANAGER, true);
        Employee juan = model.createEmployee(2, "Juan", "Alvarez", 18, 20, 40, EmployeeType.CHEF, false);
        model.createEmployeeFile(gerardo);
        model.createEmployeeFile(juan);
        System.out.println("Employ = " +model.readEmployeeFile(gerardo.getEmployeeId()+""));
        System.out.println("List");
        EmployeeList employees = model.readAllEmployeeFiles();
        for(Employee employee: employees){
            System.out.println(employee);
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.java2.project;

import java.util.ArrayList;

/**
 *
 * @author threa
 */
public class EmployeeList extends ArrayList<Employee> {
    
    public EmployeeList() {
        super();
    }
    
    public EmployeeList(Employee...employees) {
        for(Employee employee: employees) {
            this.add(employee);
        }
    }
    
}

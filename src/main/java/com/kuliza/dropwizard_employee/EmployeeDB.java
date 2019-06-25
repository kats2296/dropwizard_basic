package com.kuliza.dropwizard_employee;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class EmployeeDB {

    public static HashMap<Integer,Employee> employees = new HashMap<>();

    static {
        employees.put(1, new Employee(1, "AB" , "ab" , "ab@ab.com"));
        employees.put(2, new Employee(2, "CD" , "cd" , "cd@cd.com"));
        employees.put(3, new Employee(3, "EF" , "ef" , "ef@ef.com"));
        employees.put(4, new Employee(4, "GH" , "gh" , "gh@gh.com"));
        employees.put(5, new Employee(5, "IJ" , "ij" , "ij@ij.com"));
    }

    public static List<Employee> getEmployees() {
        return new ArrayList<Employee>(employees.values());
    }

    public static Employee getEmployee(Integer id){
        return employees.get(id);
    }

    public static void removeEmployee(Integer id){
        employees.remove(id);
    }

    public static void updateEmployee(Integer id, Employee employee) {
        employees.put(id, employee);
    }
}

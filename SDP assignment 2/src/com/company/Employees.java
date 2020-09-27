package com.company;

public class Employees {
    private Employee employee;

    public Employees (Employee employee) {
        this.employee = employee;
    }

    public static void addEmployee(Employee employee){
        employee.getEmployee().add(employee);
    }
    public static void removeEmployee(Employee employee){
        employee.getEmployee().remove(employee);
    }

    public void printEmployee(){
        for(Employee employee : this.employee.getEmployee()){
            if(employee != null){
                System.out.println(employee.toString());
            }
        }
    }
}

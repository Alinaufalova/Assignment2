package com.company;

public class ClassEmployeePr implements EmployeePr{
    private ClassEmployee employee = null;

    public ClassEmployeePr (String name, String lastname, ClassEmployee employee){
        this.employee = employee;
        this.employee.name = name;
        this.employee.lastname = lastname;
    }

    public ClassEmployeePr(ClassEmployee employee){
        this.employee = employee;
    }

    public ClassEmployeePr(){
        this.employee = new ClassEmployee();
    }

    @Override
    public void info() {
        System.out.println("Employee " + employee.name + employee.lastname);
    }
}



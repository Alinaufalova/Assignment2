package com.company;

import java.util.List;

public class Employee {
    private String name;
    private String position;
    private int age;
    private List<Employee> employee;

    public Employee(String name, String position, int age, List<Employee> employee) {
        this.name = name;
        this.position = position;
        this.age = age;
        this.employee = employee;
    }

    public List<Employee> getEmployee() {
        return employee;
    }

    @Override
    public String toString() {
        return "name " + name
                + " age " + age
                + " position " + position;
    }
}

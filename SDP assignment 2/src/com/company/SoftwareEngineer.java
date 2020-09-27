package com.company;

import java.util.List;

public class SoftwareEngineer extends Employee implements Vacancy{
    public SoftwareEngineer(String name, String position, int age, List<Employee> employee) {
        super(name, position, age, employee);
    }

    @Override
    public void work() {
        System.out.println("works as Software Engineer");
    }
}

package com.company;

import java.util.List;

public class ITManager extends Employee implements Vacancy{
    public ITManager(String name, String position, int age, List<Employee> employee) {
        super(name, position, age, employee);
    }

    @Override
    public void work() {
        System.out.println("works as IT Manager");
    }
}

package com.company;

import java.util.List;

public class BigDataAnalytic extends Employee implements Vacancy {
    public BigDataAnalytic(String name, String position, int age, List<Employee> employee) {
        super(name, position, age, employee);
    }

    @Override
    public void work() {
        System.out.println("works as Big Data Analytic");
    }
}

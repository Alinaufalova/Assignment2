package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        SoftwareEngineer engineer = new SoftwareEngineer("KarlikNos","software engineer",47, employees);
        BigDataAnalytic analytic = new BigDataAnalytic("Sqwidward","bid data analytic",32,employees);
        ITManager manager = new ITManager("Morty", "it manager", 65 , employees);

        Employees employees = new Employees();
        Employees.addEmployee(Sqwidward);
        Employees.addEmployee(KarlikNos);

        Employees.printEmployee();

        KarlikNos.work();
        Employees.removeEmployee(KarlikNos);
    }
}


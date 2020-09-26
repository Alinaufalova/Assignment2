package com.company;

import java.util.ArrayList;
import java.util.List;

public class ClassEmployee extends Person implements Employee{
    public String responsibility = "none";
    public List<Employee>  coworkers;


    public ClassEmployee (String name, String lastName, String responsibility){
        super(name, lastName);
        this.coworkers = new ArrayList<>();
        this.responsibility = responsibility;
    }

    public ClassEmployee(String responsibility){
        this.responsibility = responsibility;
    }
    public void addcoworkers(Employee employee){
        coworkers.add(employee);
    }
    public ClassEmployee(){

    }

    @Override
    public void work() {
        System.out.println("works as " + this.responsibility + " ");
    }

    @Override
    public String toString() {
        return "ClassCompany{" +
                "name = '" + name + '\''+
                ", type = '" + type + '\'' +
                ", description = '" + description + '\'' +
                ", employees =" + emplyees +
                '}';
    }


}

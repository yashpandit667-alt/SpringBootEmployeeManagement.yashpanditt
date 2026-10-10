package org.example.springboot;

import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class Employee {
    private String name;
    private double salary;


    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void displayDetails(){
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

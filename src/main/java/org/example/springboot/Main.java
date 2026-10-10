package org.example.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.ArrayList;

@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Main.class, args);
//        ArrayList<Employee> employees = new ArrayList<>();
//        employees.add(new Employee("Yash",35000));
//        employees.add(new Employee("Akif",30000));
//        employees.add(new Employee("Raja",25000));
//
//        for (Employee employee : employees){
//            employee.displayDetails();
//        }

        EmployeeService service = context.getBean(EmployeeService.class);
        service.showAllEmployees();
        context.close();

    }

}

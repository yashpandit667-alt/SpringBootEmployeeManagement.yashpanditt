package org.example.springboot;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class EmployeeService {
   // private String name;
    //  @Autowired
    private Employee employee;

//    @Component
//    public class Employee {
//        private String name;
//        private double salary;


//        public Employee(String name, double salary) {
//            this.name = name;
//            this.salary = salary;
//        }

//        public void displayDetails(){
//            System.out.println("Name: " + name);
//            System.out.println("Salary: " + salary);
//        }
//    }


    public void showAllEmployees(){
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Yash",35000));
        employees.add(new Employee("Akif",30000));
        employees.add(new Employee("Raja",25000));

        for (Employee employee : employees){
            employee.displayDetails();
        }

    }

    public EmployeeService( Employee employee){
        this.employee = employee;
    }


    public void showEmployee() {
        employee.displayDetails();
    }
}
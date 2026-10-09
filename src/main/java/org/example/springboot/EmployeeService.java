package org.example.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeService {
  //  @Autowired
    private Employee employee;

    public EmployeeService( Employee employee){
        this.employee = employee;
    }


    public void showEmployee() {
        employee.displayDetails();
    }
}

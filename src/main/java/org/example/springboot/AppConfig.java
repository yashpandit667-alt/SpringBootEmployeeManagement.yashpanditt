package org.example.springboot;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public Employee employee() {

        Employee employee = new Employee("Yash Pandit", 30000);
        return employee;
    }
}

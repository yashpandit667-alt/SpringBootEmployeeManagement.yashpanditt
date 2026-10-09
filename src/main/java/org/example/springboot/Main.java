package org.example.springboot;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.availability.ApplicationAvailabilityAutoConfiguration;
import org.springframework.boot.autoconfigure.context.ConfigurationPropertiesAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Main {

    public static void main(String[] args) {SpringApplication.run(Main.class, args);
        ConfigurableApplicationContext context =
                SpringApplication.run(Main.class, args);

        EmployeeService service = context.getBean(EmployeeService.class);
        service.showEmployee();
        context.close();

    }

}

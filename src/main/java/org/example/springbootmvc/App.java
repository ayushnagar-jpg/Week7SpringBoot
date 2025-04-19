package org.example.springbootmvc;

import org.example.springbootmvc.controller.beans.EmployeeBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("org.example.springbootmvc.controller.beans")
public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(App.class);
        EmployeeBean employee = context.getBean(EmployeeBean.class);
        employee.showDetails();
    }
}


package com.cts.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans-config.xml");
        Employee emp = context.getBean("employeeBean", Employee.class);
        emp.showEmployeeDetails();
    }
}

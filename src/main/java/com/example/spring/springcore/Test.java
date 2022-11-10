package com.example.spring.springcore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        var ctx = new ClassPathXmlApplicationContext("configs/config.xml");
        Employee employee = ctx.getBean("emp", Employee.class);
        System.out.println(employee);
    }
}

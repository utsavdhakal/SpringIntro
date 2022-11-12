package com.example.spring.springcore.innerbeans;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        var ctx = new ClassPathXmlApplicationContext("configs/innerbeans/config.xml");
        Employee employee = ctx.getBean("employee", Employee.class);
        System.out.println(employee);
    }
}

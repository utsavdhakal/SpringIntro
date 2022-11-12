package com.example.spring.springcore.map;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        var ctx = new ClassPathXmlApplicationContext("configs/setter-injection/map-config.xml");
        Customer customer = ctx.getBean("customer", Customer.class);
        System.out.println(customer);
    }
}

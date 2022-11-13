package com.example.spring.springcore.propertyplaceholder.assignment;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        var ctx = new ClassPathXmlApplicationContext("configs/propertyplaceholder/assignment/config.xml");
        WebServiceClient client = ctx.getBean("client", WebServiceClient.class);
        System.out.println(client);
    }
}

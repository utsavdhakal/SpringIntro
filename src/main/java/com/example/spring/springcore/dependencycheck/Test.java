package com.example.spring.springcore.dependencycheck;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        var ctx = new ClassPathXmlApplicationContext("configs/dependencycheck/config.xml");
        Prescription prescription = ctx.getBean("prescription", Prescription.class);
        System.out.println(prescription);
    }
}

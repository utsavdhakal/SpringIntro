package com.example.spring.springcore.lc.interfaces;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        var ctx = new ClassPathXmlApplicationContext("configs/lc/interfaces/config.xml");
        ctx.registerShutdownHook();
        Patient patient = ctx.getBean("patient", Patient.class);
        System.out.println(patient);
    }
}

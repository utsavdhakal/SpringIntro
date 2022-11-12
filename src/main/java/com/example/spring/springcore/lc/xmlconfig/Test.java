package com.example.spring.springcore.lc.xmlconfig;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        var ctx = new ClassPathXmlApplicationContext("configs/lc/config.xml");
        ctx.registerShutdownHook();
        Patient patient = ctx.getBean("patient", Patient.class);
        System.out.println(patient);
    }
}

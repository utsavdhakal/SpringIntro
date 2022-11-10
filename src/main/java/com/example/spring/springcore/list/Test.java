package com.example.spring.springcore.list;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("configs/list-config.xml");
        Hospital hospital = ctx.getBean("hospital", Hospital.class);
        System.out.println(hospital);
    }
}

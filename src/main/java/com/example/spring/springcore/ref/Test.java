package com.example.spring.springcore.ref;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        var ctx = new ClassPathXmlApplicationContext("configs/ref-config.xml");
        Student student = ctx.getBean("student", Student.class);
        System.out.println(student);
    }
}

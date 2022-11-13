package com.example.spring.springcore.dependencycheck.assignment;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        var ctx = new ClassPathXmlApplicationContext("configs/dependencycheck/assignment/config.xml");

        University university = ctx.getBean("university", University.class);
        System.out.println(university.hashCode());

        University university2 = ctx.getBean("university", University.class);
        System.out.println(university2.hashCode());
    }
}

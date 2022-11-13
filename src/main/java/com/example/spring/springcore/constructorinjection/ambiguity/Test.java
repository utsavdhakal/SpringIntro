package com.example.spring.springcore.constructorinjection.ambiguity;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        var ctx = new ClassPathXmlApplicationContext("configs/constructorinjection/ambiguity/config.xml");
        Addition addition = ctx.getBean("addition", Addition.class);
    }
}

package com.example.spring.springcore.set;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        var ctx = new ClassPathXmlApplicationContext("configs/set-config.xml");
        CarDealer carDealer = ctx.getBean("carDealer", CarDealer.class);
        System.out.println(carDealer);
    }
}

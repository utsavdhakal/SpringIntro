package com.example.spring.springcore.assignment;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        var ctx = new ClassPathXmlApplicationContext("configs/setter-injection/shop-config.xml");
        ShoppingCart cart = ctx.getBean("cart", ShoppingCart.class);
        System.out.println(cart);
    }
}

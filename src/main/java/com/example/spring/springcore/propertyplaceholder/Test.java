package com.example.spring.springcore.propertyplaceholder;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        var ctx = new ClassPathXmlApplicationContext("configs/propertyplaceholder/config.xml");
        Dao dao = ctx.getBean("dao", Dao.class);
        System.out.println(dao);
    }
}

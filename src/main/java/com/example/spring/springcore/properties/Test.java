package com.example.spring.springcore.properties;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        var ctx = new ClassPathXmlApplicationContext("configs/setter-injection/prop-config.xml");
        CountryLanguage countryLanguage = ctx.getBean("lang", CountryLanguage.class);
        System.out.println(countryLanguage);
    }
}

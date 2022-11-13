package com.example.spring.springcore.constructorinjection.ambiguity;

public class Addition {
    public Addition(double a, double b) {
        System.out.println(a + b);
    }

    public Addition(int a, int b) {
        System.out.println(a + b);
    }

    public Addition(String a, String b) {
        System.out.println(a + b);
    }
}

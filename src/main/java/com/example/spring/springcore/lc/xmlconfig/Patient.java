package com.example.spring.springcore.lc.xmlconfig;

public class Patient {
    private int id;

    public Patient() {
        System.out.println("patient instantiated.");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
        System.out.println("setId method executed.");
    }

    public void init() {
        System.out.println("init method called.");
    }

    public void destroy() {
        System.out.println("destroy method called.");
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                '}';
    }
}

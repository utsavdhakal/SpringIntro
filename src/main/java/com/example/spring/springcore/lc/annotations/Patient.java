package com.example.spring.springcore.lc.annotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Patient {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @PostConstruct
    public void init() {
        System.out.println("init method executed.");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("destroy method executed.");
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                '}';
    }
}

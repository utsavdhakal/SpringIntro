package com.example.spring.springcore.lc.assignment;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class TicketReservation {

    @PostConstruct
    public void initialize() {
        System.out.println("initialize() method called.");
    }

    @PreDestroy
    public void cleanUp() {
        System.out.println("cleanUp() method called.");
    }

}

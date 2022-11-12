package com.example.spring.springcore.lc.assignment;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        var ctx = new ClassPathXmlApplicationContext("configs/lc/assignment/config.xml");
        ctx.registerShutdownHook();
        TicketReservation ticketReservation = ctx.getBean("ticket", TicketReservation.class);
        System.out.println(ticketReservation);
    }
}

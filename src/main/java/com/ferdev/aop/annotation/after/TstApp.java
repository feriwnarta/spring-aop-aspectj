package com.ferdev.aop.annotation.after;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TstApp {
    public static void main(String[] args) {

        ApplicationContext context
                = new ClassPathXmlApplicationContext("aspekAfterAnotasi.xml");

        com.ferdev.aop.annotation.after.Operation op = context.getBean("targetObjek", Operation.class);
        System.out.println("panggil method message");
        op.message();

        System.out.println("panggil method m");
        op.m();

        System.out.println("panggil method k");
        op.k();


    }
}

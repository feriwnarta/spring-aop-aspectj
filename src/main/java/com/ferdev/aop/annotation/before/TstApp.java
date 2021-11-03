package com.ferdev.aop.annotation.before;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TstApp {
    public static void main(String[] args) {

        ApplicationContext context
                = new ClassPathXmlApplicationContext("beforeAspekAnnotation.xml");

        Operation op = context.getBean("objek", Operation.class);
        System.out.println("panggil method message");
        op.message();

        System.out.println("panggil method m");
        op.m();

        System.out.println("panggil method k");
        op.k();


    }
}

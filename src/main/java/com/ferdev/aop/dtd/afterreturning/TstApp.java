package com.ferdev.aop.dtd.afterreturning;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TstApp {
    public static void main(String[] args) {
        ApplicationContext context
                = new ClassPathXmlApplicationContext("afterReturningAdviceDtd.xml");

        Objek obj = context.getBean("proksi", Objek.class);
        obj.message();



    }
}

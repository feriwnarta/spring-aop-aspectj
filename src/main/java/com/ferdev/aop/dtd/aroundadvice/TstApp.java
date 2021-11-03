package com.ferdev.aop.dtd.aroundadvice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TstApp {
    public static void main(String[] args) {
        ApplicationContext context
                = new ClassPathXmlApplicationContext("arroundAviceDtd.xml");

        Objek result = context.getBean("proksiObjek", Objek.class);
        result.message();



    }
}

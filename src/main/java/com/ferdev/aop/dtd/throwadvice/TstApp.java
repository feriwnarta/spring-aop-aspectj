package com.ferdev.aop.dtd.throwadvice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TstApp {
    public static void main(String[] args) {
        ApplicationContext context
                = new ClassPathXmlApplicationContext("ThrowsAdviceDtd.xml");

        Validator v = context.getBean("proksiObjek", Validator.class);
        try {
            v.validate(10);
        } catch (Exception e){

        }



    }
}

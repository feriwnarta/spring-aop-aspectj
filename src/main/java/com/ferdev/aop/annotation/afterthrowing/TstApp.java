package com.ferdev.aop.annotation.afterthrowing;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TstApp {
    public static void main(String[] args) {
        ApplicationContext context
                = new ClassPathXmlApplicationContext("afterThrowingAspek.xml");


        Operation op = context.getBean("targetObjek", Operation.class);
        System.out.println("method pertama berhasil");
        try {
            op.validate(20);
        } catch (Exception exception){

        }

        System.out.println("method ke 2 error");
        try {
            op.validate(10);
        } catch (Exception exception){

        }




    }
}

package com.ferdev.aop.annotation.afterreturning;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TstApp {
    public static void main(String[] args) {
        ApplicationContext context
                = new ClassPathXmlApplicationContext("afterReturningAspek.xml");

        Operation op = context.getBean("targetObjek", Operation.class);
        System.out.println("panggil method 1");
        System.out.println(op.method1() + " dari kelas test");

        System.out.println("panggil method 2");
        System.out.println(op.method2() + " dari kelas test");

        System.out.println("panggil method 3");
        System.out.println(op.method3() + " dari kelas test");


    }
}

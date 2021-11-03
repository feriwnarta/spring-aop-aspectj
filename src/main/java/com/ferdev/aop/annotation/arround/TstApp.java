package com.ferdev.aop.annotation.arround;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TstApp {
    public static void main(String[] args) {
        ApplicationContext context
                = new ClassPathXmlApplicationContext("arroundAspekAnnotation.xml");

        Operation op = context.getBean("targetObjek", Operation.class);
        op.method1();
        op.method2();
        op.method3();
    }
}

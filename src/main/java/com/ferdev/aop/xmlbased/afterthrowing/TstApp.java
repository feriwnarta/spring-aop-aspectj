package com.ferdev.aop.xmlbased.afterthrowing;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TstApp {
    public static void main(String[] args) {
        ApplicationContext context
                = new ClassPathXmlApplicationContext("afterThrowingXml.xml");


        Validasi v = context.getBean("targetObjek", Validasi.class);
        System.out.println("method ini berhasil");
        try {
            v.cekUmur(20);
        } catch (Exception exception){};

        System.out.println("method ini tidak berhasil");
        try {
            v.cekUmur(10);
        } catch (Exception exception){};

    }
}

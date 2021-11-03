package com.ferdev.aop.dtd.throwadvice;

public class Validator {
    public void validate(int age) throws Exception{
        if(age < 17) {
            throw new ArithmeticException("usia dibawah umur");
        } else {
            System.out.println("anda boleh masuk");
        }
    }
}

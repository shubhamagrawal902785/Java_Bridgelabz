package com.briedelabz.day1;


public class Staticmethod {
    public static void main(String[] args) {
        System.out.println("static method");
        
       
        
        Staticmethod b1 = new Staticmethod();
        b1.s2();
    }

    private void s2() {
        System.out.println("non static method");
    }

    
}
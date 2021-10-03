package com.Assignment4.com.com;


public class StaticMethodEx1 {

    static int a;
    static int c;

    static void method1() {
        a = 10;
        c = 30;
        System.out.println("Method 1");
        System.out.println("a=" + a);
        System.out.println("c=" + c);
    }

    static void method2() {
        method1();
        a = 200;
        c = 400;
        System.out.println("Method 2");
        System.out.println("a=" + a);
        System.out.println("c=" + c);
    }

    public static void main(String[] args) {
        System.out.println("Hello");
        StaticMethodEx1.method2();

    }
}


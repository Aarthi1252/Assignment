package com.Assignment4.com.com;


public class StaticMethodEx2 {
    static void staticmethod() {
        int x = 10;
        int y = 20;
        System.out.println("Static Method");
        StaticMethodEx2 smex2 = new StaticMethodEx2();
        smex2.staticmethod1();
        System.out.println("x=" + x);
        System.out.println("y=" + y);

    }

    public static void main(String[] args) {
        System.out.println("Hello");
        StaticMethodEx2.staticmethod();


    }

    void staticmethod1() {
        int x = 21;
        int y = 22;
        System.out.println("Instance Method");
        System.out.println("x=" + x);
        System.out.println("y=" + y);
    }
}


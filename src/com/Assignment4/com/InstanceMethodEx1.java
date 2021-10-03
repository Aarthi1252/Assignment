package com.Assignment4.com;


public class InstanceMethodEx1 {
    int m1;

    public static void main(String[] args) {
        System.out.println("Hello");
        InstanceMethodEx1 imex1 = new InstanceMethodEx1();
        imex1.Method2();


    }

    void Method1() {
        m1 = 100;
        System.out.println(" Method 1" + m1);
    }

    void Method2() {
        Method1();
        m1 = 200;
        System.out.println("Method 2" + m1);

    }
}


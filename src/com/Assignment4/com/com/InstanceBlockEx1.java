package com.Assignment4.com.com;


public class InstanceBlockEx1 {
    static int c = 20;
    int a = 10;

    {
        System.out.println("Instance Block");
        int b = 30;
        System.out.println("a=" + a);
        System.out.println("b=" + b);
        System.out.println("c=" + c);
        add();
        display();
    }

    InstanceBlockEx1() {
        System.out.println("Constructor");
    }

    static void display() {
        System.out.println("Static Method");
    }

    public static void main(String[] args) {
        System.out.println("Hello");
        InstanceBlockEx1 ibex1 = new InstanceBlockEx1();

    }

    void add() {
        System.out.println("Instance Method");
    }
}


package com.Assessment.com;


public class InstanceBlockEx1 {
    static int c = 30;
    int a = 10;

    {
        System.out.println("Instance Block");
        int a = 100;
        String name = "abc";
        int b = 300;
        System.out.println("Instance Block=" + a);
        System.out.println("Instance Block=" + name);
        System.out.println("Instance Block=" + b);
    }

    InstanceBlockEx1() {
        System.out.println("constructor");
        int b = 20;
        System.out.println("Local Variable=" + a);
        System.out.println("Instance Variable=" + b);
        System.out.println("Static Method=" + c);
    }

    public static void main(String[] args) {
        System.out.println("Hello");
        InstanceBlockEx1 ibex1 = new InstanceBlockEx1();
        ibex1.InstanceMethod();
        ibex1.StaticMethod();
    }

    void InstanceMethod() {
        System.out.println("Instance Method=" + a);
    }

    void StaticMethod() {
        InstanceBlockEx1 ibex1 = new InstanceBlockEx1();
        System.out.println("Static Method=" + ibex1.a);
    }
}


package com;

public class StaticMethodEx1 {
    static int m2;
    int m1;

    static void disp() {
        StaticMethodEx1 smex1 = new StaticMethodEx1();
        smex1.m1 = 200;
        m2 = 400;
        int m3 = 600;
        System.out.println("Static Method values");
        System.out.println("M1=" + smex1.m1 + "" + "M2=" + m2 + "" + "M3=" + m3);
        smex1.display();

    }

    public static void main(String[] args) {
        System.out.println("Hello");
        StaticMethodEx1 smex1 = new StaticMethodEx1();
        smex1.disp();


    }

    void display() {
        m1 = 10;
        m2 = 20;
        int m3 = 30;
        System.out.println("Instance Method values");
        System.out.println("M1=" + m1 + "" + "M2=" + m2 + "" + "M3=" + m3);
    }
}


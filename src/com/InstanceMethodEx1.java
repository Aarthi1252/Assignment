package com;

public class InstanceMethodEx1 {
    static int b;
    int a;

    static void disp() {
        InstanceMethodEx1 imex1 = new InstanceMethodEx1();
        imex1.a = 11;
        b = 12;
        int c = 13;
        System.out.print("Static Method values");
        System.out.print("a=" + imex1.a + "" + "b=" + b + "" + "c=" + c);

    }

    public static void main(String[] args) {
        System.out.println("Hello");
        InstanceMethodEx1 imex1 = new InstanceMethodEx1();
        imex1.display();


    }

    void display() {
        a = 10;
        b = 20;
        int c = 30;
        System.out.println("Instance Method values");
        System.out.println("a=" + a + "" + "b=" + b + "" + "c=" + c);
        InstanceMethodEx1.disp();
    }
}


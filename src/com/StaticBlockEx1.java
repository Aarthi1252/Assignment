package com;

public class StaticBlockEx1 {
    static String name = "abc";

    static {
        System.out.println("StaticBlock");

        float mark = 98;
        System.out.println("Mark=" + mark);
        StaticBlockEx1 sbex1 = new StaticBlockEx1();
        sbex1.add();
        sbex1.display();

    }

    int a = 10;

    StaticBlockEx1() {
        System.out.println("Constructor");
    }

    static void display() {
        System.out.println("Static Method");
        System.out.println("NAME=" + name);
    }

    public static void main(String[] args) {
        System.out.println("Hello");


    }

    void add() {
        System.out.println("Instance Method");
        System.out.println("a=" + a);
    }
}


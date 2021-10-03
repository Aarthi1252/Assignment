package com.Assignment4.com.com;


public class StaticBlockEx1 {

    static String name = "Liya";

    static {
        System.out.println("Static Block");
        int x = 100;
        float mark = 98;
        System.out.println("a=" + x);
        System.out.println("NAME=" + name);
        System.out.println("MARK=" + mark);
        StaticBlockEx1 sbex1 = new StaticBlockEx1();
        sbex1.stud();
        StaticBlockEx1.display();

    }

    StaticBlockEx1() {
        System.out.println("Constructor");
    }

    static void display() {
        System.out.println("Static Method");
    }

    public static void main(String[] args) {
        System.out.println("Hello");
    }

    void stud() {
        System.out.println("Instance Method");
    }
}

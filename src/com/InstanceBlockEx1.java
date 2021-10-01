package com;

public class InstanceBlockEx1 {
    static int c = 300;
    int a = 100;

    {
        System.out.println("Instance Block");
        int b = 200;

        System.out.println(b);
    }

    InstanceBlockEx1() {
        System.out.println("Constructor");
    }

    static void display() {
        System.out.println("Static Method");
        System.out.println(c);
    }

    public static void main(String[] args) {
        System.out.println("Hello");
        InstanceBlockEx1 ibex1 = new InstanceBlockEx1();
        ibex1.add();
        ibex1.display();

    }

    void add() {
        System.out.println("Instance Method");
        System.out.println(a);
    }


}



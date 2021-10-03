package com.Assignment4.com.com;


public class InstanceMethodEx2 {
    static void staticmethod() {
        int a = 12;
        String name = "Ahaana";
        System.out.println("Static Method");
        System.out.println("a=" + a);
        System.out.println("NAME=" + name);
    }

    public static void main(String[] args) {
        System.out.println("Hello");
        InstanceMethodEx2 imex2 = new InstanceMethodEx2();
        imex2.instancemethod();


    }

    void instancemethod() {
        int a = 21;
        String name = "Rihaan";
        System.out.println("Instance Method");
        System.out.println("a=" + a);
        System.out.println("NAME=" + name);
        staticmethod();
    }
}


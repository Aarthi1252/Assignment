package com.Assessment1.com.com;

public class ConstructorEx2 {


    static int b;
    int a;

    ConstructorEx2() {
        a = 1000;
        b = 2000;
    }

    static void StaticMethod() {
        System.out.println("Static Method=" + b);
    }

    public static void main(String[] args) {
        System.out.println("Hello");
        ConstructorEx2 cex2 = new ConstructorEx2();
        cex2.InstanceMethod();
        StaticMethod();
    }

    void InstanceMethod() {
        System.out.println("Instance Method=" + a);
    }
}



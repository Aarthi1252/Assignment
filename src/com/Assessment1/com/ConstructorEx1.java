package com.Assessment1.com;

public class ConstructorEx1 {
    static int c = 300;
    int a = 100;

    ConstructorEx1() {
        int b = 200;
        System.out.println("Local Variable=" + b);
        System.out.println(" Instance Variable=" + a);
        System.out.println(" Static Variable=" + c);
    }

    public static void main(String[] args) {
        System.out.println("Hello");
        ConstructorEx1 cex1 = new ConstructorEx1();
    }
}



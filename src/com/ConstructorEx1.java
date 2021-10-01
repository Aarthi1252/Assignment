package com;

public class ConstructorEx1 {
    static int y;
    int x;

    ConstructorEx1() {
        x = 10;
        y = 20;
    }

    static void multiply() {
        int z;
        ConstructorEx1 cex1 = new ConstructorEx1();
        z = cex1.x * y;
        System.out.println("Multiplication=" + z);

    }

    public static void main(String[] args) {
        System.out.println("Hello");
        ConstructorEx1 cex1 = new ConstructorEx1();
        cex1.add();
        cex1.multiply();
    }

    void add() {
        int z;
        z = x + y;
        System.out.println("Addition=" + z);
    }
}


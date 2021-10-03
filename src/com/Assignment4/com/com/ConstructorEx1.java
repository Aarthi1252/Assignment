package com.Assignment4.com.com;


public class ConstructorEx1 {
    static int y = 42;
    int x = 41;

    1()

    {
        int z;
        z = x + y;
        System.out.println(x + "+" + y + "=" + z);
        multiply();
        add();
    }

    static void multiply() {
        System.out.println("Static Method");

    }

    public static void main(String[] args) {
        System.out.println("Hello");
        1 cex1 = new 1 ();
    }

    void add() {
        System.out.println("Instance Method");
    }
}

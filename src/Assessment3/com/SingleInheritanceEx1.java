package Assessment3.com;


class parentclass {
    static int b = 20;

    static {
        System.out.println("Parent static block");
    }

    int a = 10;

    {
        System.out.println("Parent instance block");
    }

    parentclass() {
        System.out.println("Parent class constructor1");
    }

    static void sub() {
        System.out.println("Parent static method");
        int c;
        parentclass pcex1 = new parentclass();
        c = pcex1.a - b;

        System.out.println("Subtraction: " + c);

    }

    void add() {
        System.out.println("Parent instance method");
        int c;
        c = a + b;
        System.out.println("addition:" + c);

    }


}

class Childclass extends parentclass {
    static int b = 200;

    static {
        System.out.println("Child static block");
    }

    int a = 100;

    {

        System.out.println("Child instance block");
    }

    Childclass() {
        System.out.println("Child class constructor1");
    }

    static void sub() {
        System.out.println("Child static method");
        int c;
        Childclass ccex1 = new Childclass();
        c = ccex1.a - b;
        System.out.println("Subtraction:" + c);
    }

    void add2() {
        super.add();
        System.out.println("Child instance method");
        int c;
        c = a + b;
        System.out.println("Addition:" + c);
    }

}

public class SingleInheritanceEx1 {
    public static void main(String[] args) {

        Childclass ccex1 = new Childclass();
        ccex1.add();
        Childclass.sub();
    }
}




package Assessment3.com.com;


class parentclss {
    static int b = 20;

    static {
        System.out.println("Parent static block");
    }

    int a = 10;

    {
        System.out.println("Parent instance block");
    }

    parentclss() {
        System.out.println("Parent class constructor1");

    }

    static void sub() {
        System.out.println("Parent static method");
        int c;
        parentclss pcex1 = new parentclss();
        c = pcex1.a - b;
        System.out.println("Subtraction=" + c);
    }

    void add() {
        System.out.println("Parent instance method");
        int c;
        c = a + b;
        System.out.println("Addition=" + c);
    }

}

class childclss extends parentclss {
    static int b = 22;

    static {
        System.out.println("Child static block");
    }

    int a = 21;

    {

        System.out.println("Child instance block");
    }

    childclss() {
        System.out.println("Child class constructor1");
    }

    static void sub1() {
        System.out.println("Child static method ");
        int c;
        childclss ccex1 = new childclss();
        c = ccex1.a - b;
        System.out.println("Subtraction=" + c);

    }

    void add1() {
        super.add();
        System.out.println("Child instance method ");
        int c;
        c = a + b;
        System.out.println("Addition=" + c);

    }
}

class childclss2 extends parentclss {
    static int b = 42;

    static {
        System.out.println("Child2 static block");
    }

    int a = 41;

    {

        System.out.println("Child2 instance block");
    }

    childclss2() {
        System.out.println("Child2 class constructor1");
    }

    static void sub2() {
        System.out.println("Child2 static method");
        int c;
        childclss2 ccex2 = new childclss2();
        c = ccex2.a - b;
        System.out.println("Subtraction=" + c);
    }

    void add2() {
        this.add();
        System.out.println("Child2 instance method");
        int c;
        c = a + b;
        System.out.println("Addition=" + c);

    }

}

public class HierarchicalInheritaneEx1 {
    public static void main(String[] args) {
        childclss ccex1 = new childclss();
        ccex1.add();
        childclss.sub();
        childclss2 ccex2 = new childclss2();
        ccex2.add();
        childclss2.sub();


    }

}


package Assessment3.com.com;

class parentcls {
    static int b = 12;

    static {
        System.out.println("Parent static block");
    }

    int a = 11;

    {
        System.out.println("Parent instance block");
    }

    parentcls() {
        System.out.println("Parent class constructor1");

    }

    static void sub() {
        System.out.println("Parent static method");
        int c;
        parentcls pcex1 = new parentcls();
        c = pcex1.a - b;
        System.out.println("Subtraction:" + c);
    }

    void add() {
        System.out.println("parent instance method");
        int c;
        c = a + b;
        System.out.println(" Addiction:" + c);
    }
}

class Childcls extends parentcls {
    static int b = 22;

    static {
        System.out.println("Child static block");
    }

    int a = 21;

    {

        System.out.println("Child instance block");
    }

    Childcls() {
        System.out.println("Child class constructor1");
    }

    static void sub1() {
        System.out.println("Child static method");
        int c;
        Childcls ccex1 = new Childcls();
        c = ccex1.a - b;
        System.out.println("Subtraction:" + c);

    }

    void add1() {
        super.add();
        System.out.println("Child instance method");
        int c;
        c = a + b;
        System.out.println("Addition:" + c);
    }
}

class Grandparentcls extends Childcls {
    static int b = 32;

    static {
        System.out.println("Grandparent static block");
    }

    int a = 31;

    {

        System.out.println("Grandparent instance block");
    }

    Grandparentcls() {
        System.out.println("Grandparent class constructor1");
    }

    static void sub2() {
        System.out.println("Grandparent static method  ");
        int c;
        Grandparentcls gpcex1 = new Grandparentcls();
        c = gpcex1.a - b;
        System.out.println("Subtraction:" + c);
    }

    void add2() {
        this.add();
        System.out.println("Grandparent instance method");
        int c;
        c = a + b;
        System.out.println("Addiction:" + c);

    }

}

public class MultilevelInheritanceEx1 {
    public static void main(String[] args) {

        Grandparentcls gpcex1 = new Grandparentcls();
        gpcex1.add2();
        Grandparentcls.sub2();
        Childcls ccex1 = new Childcls();
        ccex1.add1();
        Childcls.sub1();


    }
}



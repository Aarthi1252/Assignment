package com.janexercise;

public class ClassRoom {
    public static void main(String[] args) {
        ClassRoom1 classRoom1 = new ClassRoom1();
        classRoom1.setName("Test");
        classRoom1.setId(1234);
        classRoom1.get();
        System.out.println("Name:" + classRoom1.getName());
        System.out.println("Id:" + classRoom1.getId());
        System.out.println("Average:" + classRoom1.average);
    }
}

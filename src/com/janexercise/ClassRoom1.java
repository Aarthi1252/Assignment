package com.janexercise;

public class ClassRoom1 {
    int test1;
    int test2;
    int test3;
    int average;
    private String name;
    private int id;

    public String getName() {
        return name;
    }

    public void setName(String name1) {
        name = name1;
    }

    public int getId() {
        return id;
    }

    public void setId(int id1) {
        id = id1;

    }

    void get() {
        test1 = 100;
        test2 = 100;
        test3 = 100;
        average = (test1 + test2 + test3) / 3;
    }
}


package com.rajeev.abstractClass;

public abstract class Parent {
    int age;
    final int VALUE;

    public Parent(int age) {
        this.age = age;
        VALUE = 123456;
    }

    //abstract class can contain static & normal method
    static void hello() {
        System.out.println("hey");
    }

    //normal method
    void normal() {
        System.out.println("this is normal method");
    }

    abstract void career();

    abstract void partner();

}

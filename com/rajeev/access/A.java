package com.rajeev.access;

public class A {
    private int num;
    private String name;
    int[] arr;

    //getter methods gets the value & setter methods sets the values of the
    public int getNum() {
        return num;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public A(String name , int num){
        this.name = name;
        this.num = num;
        this.arr = new int[num];
    }

}

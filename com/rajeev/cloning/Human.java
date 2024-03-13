package com.rajeev.cloning;

public class Human implements Cloneable {
    String name;
    int age;
    int[] arr;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
        this.arr = new int[]{1, 2, 3, 5, 6, 7, 8, 9};
    }


//  no need to do this after implementing the cloneable interface
//    public Human(Human other) {
//        this.name = other.name;
//        this.age = other.age;
//    }

//    @Override//override allows
//    public Object clone() throws CloneNotSupportedException {
//        return super.clone();
//    }//shallow copy of the object


    //deep copy
    public Object clone() throws CloneNotSupportedException {
        //this is deep copy
        Human twin = (Human) super.clone(); // this is actually shallow copy

        //make deep copy
        twin.arr = new int[twin.arr.length];
        for (int i = 0; i < twin.arr.length; i++) {
            twin.arr[i] = this.arr[i];
        }
        return twin;
    }
}

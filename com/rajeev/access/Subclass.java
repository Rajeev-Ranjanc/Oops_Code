package com.rajeev.access;

public class Subclass extends A {

    public Subclass(String name, int num) {
        super(name, num);
    }
    public static void main(String[] args){
        Subclass sb = new Subclass("Rajeev Ranjan" , 78);
//        int n = sb.num; this will work when num will be protected
        //checking the is sb is also an instance of these classes
        System.out.println(sb instanceof Subclass);
//        System.out.println(sb instanceof Object);
//        System.out.println(sb instanceof A);
    }
}

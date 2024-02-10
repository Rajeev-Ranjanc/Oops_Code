package com.rajeev.StaticEXample;

//This is the demo to show instantiation of static variables
public class StaticBlock {
    static int a = 4;
    static int b;

//    will run only once, when the first obj is created i.e.
//    when class is loaded for the very first time
    static {

        System.out.println("I'm in static Block");

        b = a * 5;

    }

    public static void main(String[] args) {

        StaticBlock obj = new StaticBlock();
        System.out.println(StaticBlock.a+"  " + StaticBlock.b);

        StaticBlock.b+=3;
        System.out.println(StaticBlock.a +"  " + StaticBlock.b);

        StaticBlock obj2 = new StaticBlock();
        System.out.println(StaticBlock.a +"  " + StaticBlock.b);
    }
}

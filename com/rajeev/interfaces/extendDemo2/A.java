package com.rajeev.interfaces.extendDemo2;

public interface A {
//   static interface methods should always have body

//    because interface means inheritance and static methods doesn't depend upon
//    object that's why it can be inherited
//    Calls via interface name
    static void greeting()
    {
        System.out.println("hey i'm static method");
    }
    default void fun(){
        System.out.println("I an in A");
    }
}

package com.rajeev.interfaces.nestedInterfaces;

public class A {
    //nested Interfaces
    public interface NestedInterfaces{
        boolean isOdd(int num);
    }
}
class B implements A.NestedInterfaces{

    @Override
    public boolean isOdd(int num) {
        return (num & 1) == 1;
    }
}

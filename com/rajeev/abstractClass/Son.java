package com.rajeev.abstractClass;

public class Son extends Parent {
    public Son(int age) {
        super(age);
    }

    @Override
    void career() {
        System.out.println("I'm going to be an Engineer");
    }

    @Override
    void partner() {
        System.out.println("I love Pepper Potts");
    }
}

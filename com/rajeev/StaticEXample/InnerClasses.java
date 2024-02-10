package com.rajeev.StaticEXample;

public class InnerClasses {
     static class Test{
//         The object of Test class don't depend on the InnerClass, but it can have different obj
        String name;
        public Test(String name){
            this.name = name;
        }

    }

    public static void main(String[] args) {
        Test a = new Test("Rajeev");
        Test b = new Test("Rahul");

        System.out.println(a.name);
        System.out.println(b.name);
    }
}

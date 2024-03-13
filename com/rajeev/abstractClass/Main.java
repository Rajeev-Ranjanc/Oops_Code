package com.rajeev.abstractClass;

public class Main {
    public static void main(String[] args) {
        Son son = new Son(25);
        son.career();
        son.normal();

        //overriding wali concept -> where reference variable is of Parent type and Object variable is of Child type
//        this concept is covered very well in inheritance which is present in the Inheritance package
//        Parent daughter = new Daughter(23);
//        daughter.career();
//        daughter.partner();
//        daughter.normal();

        Daughter daughter = new Daughter(23);
        daughter.career();
        daughter.partner();
        daughter.normal();

    }
}

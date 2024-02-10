package com.rajeev.staticexample;

public class Human {
    int age;
    String name;
    int salary;
    boolean married;
    static int population;
    static void message(){
        System.out.println("Hello message from your love one");
//        System.out.println(this.age);
//        System.out.println(this.population);
//    we can't use this keyword inside the static method because this means objects
    }
    public Human(int age , String name , int salary , boolean married){
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        Human.population +=1;
    }
}

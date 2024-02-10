package com.rajeev.staticexample;

public class Main {
    public static void main(String[] args) {

        Human rajeev = new Human(22 , "Rajeev Ranjan" , 100000 , false);

        Human rahul = new Human(23 , "Rahul Panwar" , 50000 , true);

        //while accessing the static variable always use class name instead of object to access the static variable

        System.out.println(Human.population);

        System.out.println(Human.population);



    }

    //this is not dependent on the object
    static void fun(){
        System.out.println("hello rajeev");
//        greeting()    //you cant use this because it requires an instance
//        but the function (fun) you are using it in does not depend on instances

//        Hence, here I'm referencing it
        Main obj = new Main();
        obj.greeting(); // Now it's totally fine

    }

    void fun2(){
        greeting();
        //here I can call greeting methods easily because fun2 is also a non-static type
//        And I know directly or indirectly when fun2() will from main method and without creation of instance
//        it's not possible

    }

//    we know that which is not static, belongs to an object
//    this is dependent on object which is not static
//    it means this belongs to an instance and I cant use it without creation of instances
    void greeting(){
        System.out.println("Hello World");
    }
}

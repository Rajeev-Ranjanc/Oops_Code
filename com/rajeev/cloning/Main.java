package com.rajeev.cloning;

import java.util.Arrays;

/*
clone is actually a method in object class which makes exact copy of our object
cloneable is an interface

Shallow Copy:

A shallow copy of an object creates a new object but does not duplicate the contents of the original object.
Instead, it copies the references to the objects. In other words, it creates a new object with the same references
to the objects as the original object. If the referenced objects are mutable, changes to the referenced objects
in the shallow copy will be reflected in the original object.
Shallow copy is typically done using the clone() method or by manually copying the object's fields.


In Java, arrays and strings are not considered primitives.


it crates new copy for primitives and for non primitives they will point original one
primitive will copy as it is but reference variable will be pointing
Deep Copy:

A deep copy of an object creates a new object and also duplicates the contents of the original object. It recursively
copies all objects that are referenced by the original object, and all objects referenced by those objects, and so on.
This means that changes to the copied object will not affect the original object, and vice versa.

Deep copy is more complex and often involves serialization and deserialization or custom methods to copy complex objects.
 */
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human rajeev = new Human("Rajeev Ranjan", 22);
//        Human human1 = new Human(human);

        Human twin = (Human) rajeev.clone();
        System.out.println(twin.age + " " + twin.name);

//        System.out.println(Arrays.toString(twin.arr));
        //shallow copy

//        twin.age = 25;
        System.out.println(Arrays.toString(rajeev.arr));
        twin.arr[0] = 100;
        System.out.println(Arrays.toString(twin.arr));
        System.out.println(Arrays.toString(rajeev.arr));
//        System.out.println(twin.age);



        //Deep copy -> creating complete new object gonna copy everything of that object into a new object
    }
}

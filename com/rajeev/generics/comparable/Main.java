package com.rajeev.generics.comparable;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Student rajeev = new Student(78, 78.8f);
        Student manish = new Student(60, 98.8f);
        Student rahul = new Student(77, 48.8f);
        Student harsh = new Student(48, 88.8f);

        Student[] list = {rahul, rajeev, manish, harsh};
        System.out.println(Arrays.toString(list));

        //comment sectioned is not working fine
//        Arrays.sort(list, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return -(int)(o1.marks - o2.marks);
//            }
//        });

        //let's do y lambda
//        Arrays.sort(list ,((o1, o2) -> -(int)(o1.marks - o2.marks)));
//        System.out.println(Arrays.toString(list));

        if(rahul.compareTo(rajeev)<0){
            System.out.println(rahul.compareTo(rajeev));
            System.out.println("Rajeev has more marks");
        }
    }

}

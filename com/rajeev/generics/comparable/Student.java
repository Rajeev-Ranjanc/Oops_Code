package com.rajeev.generics.comparable;

//alt + fn + insert -> for constructor etc
public class Student implements Comparable<Student> {
    int rollno;
    float marks;


    public Student(int rollno, float marks) {
        this.rollno = rollno;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return marks + " ";
    }


//    @Override
    public int compareTo(Student o) {
//        System.out.println("Incomaparato methods");
        int diff = (int) (this.marks - o.marks);
        //if diff == 0: means both object are equal
        //if diff < 0 : means o is bigger else o is smaller
        return diff;
//        return 0;
    }
}

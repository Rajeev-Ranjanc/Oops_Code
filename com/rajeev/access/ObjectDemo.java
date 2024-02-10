package com.rajeev.access;

public class ObjectDemo {
    int num;
    float gpa;

    public ObjectDemo(int num, float gpa) {
        this.num = num;
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void finalize() throws Throwable {
        super.finalize();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return this.num == ((ObjectDemo) obj).num;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {
        ObjectDemo obj1 = new ObjectDemo(78 , 9.8f);
        ObjectDemo obj2 = new ObjectDemo(78 , 9.8f);
        if(obj1 == obj2){
            System.out.println("obj1 is equal to obj2");
        }
        if(obj1.equals(obj2)){
            System.out.println("obj1 is equals to obj2 by equals method");
        }

        System.out.println(obj1.getClass().getName());

        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());
    }
}

package com.rajeev.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// here T should either be Number or its subclasses
// https://docs.oracle.com/javase/tutorial/java/generics/restrictions.html#createObjects

 public class WildCardExample <T extends Number>{
    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;//also working as index value


    public WildCardExample() {
        data = new Object[DEFAULT_SIZE];
    }
    //wildcard
     public void getList(List<? extends Number> list){
        //do something
     }

    public void add(T num) {
        if (isFull()) {
            resize();
        }
        data[size++] = num;
    }

    //resizing the arraylist
    private boolean isFull() {
        return size == data.length;
    }

    //resign the length of the array and copying the elements of array
    private void resize() {

        Object[] temp = new Object[data.length * 2];

        //copy the current items into the temp ara
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }

        data = temp;
    }

    public T remove() {
//        return data[--size];
        T removed = (T) data[--size];
        return removed;
    }

    public T get(int index) {
        return (T)data[index];
    }

    public int size() {
        return size;
    }

    public void set(int index, int value) {
        data[index] = value;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
//        ArrayList list = new ArrayList();
        CustomArrayList list = new CustomArrayList();
//        list.add(5);
//        list.add(4);
//        list.add(8);
//        list.add(89);
//        list.add(77);

//        for (int i = 0; i < 15; i++) {
//            list.add(2 * i);
//        }
//        System.out.println(list);
//
//        ArrayList<Integer> list2 = new ArrayList<>();
//        list2.add("11");

        WildCardExample<Integer> list3 = new WildCardExample<>();
//        WildCardExample<String> list4 = new WildCardExample<>();
        for (int i=0;i<14;i++){
            list3.add(3*i);
        }
        System.out.println(list3);

    }
}

package com.rajeev.generics;
import java.util.Arrays;
/*
// https://docs.oracle.com/javase/tutorial/java/generics/restrictions.html#createObjects
 */
/*now I can only create object of numbers class or the class that contains Number class
 CustomGenArrayList<Integer> list2 = new CustomGenArrayList<>();
                   Integer-> this can be or Float etc. every class that contains the number class we can create object for that,
                   but we can CustomGenArrayList<String> list2 = new CustomGenArrayList<>();
 */
//public class CustomGenArrayList<T extends Number> {
public class CustomGenArrayList<T> {
    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;//also working as index value


    public CustomGenArrayList() {
        this.data = new Object[DEFAULT_SIZE];
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
        System.arraycopy(data, 0, temp, 0, data.length);

        data = temp;
    }

    public T remove() {
//        return data[--size];
        T removed = (T) data[--size];
        return removed;
    }

    public T get(int index) {
        return (T) data[index];
    }

    public int size() {
        return size;
    }

    public void set(int index, T value) {
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
//        CustomArrayList list = new CustomArrayList();
//        list.add(5);


//        for (int i = 0; i < 15; i++) {
//            list.add(2 * i);
//        }
//        System.out.println(list);

        CustomGenArrayList<String> list2 = new CustomGenArrayList<>();

        list2.add("11");
        list2.add("Aman");
        list2.add("Rohan");
        list2.add("Amarkant");
        list2.add("Rajeev");
        list2.add("Mainsh");

        System.out.println(list2);

    }
}

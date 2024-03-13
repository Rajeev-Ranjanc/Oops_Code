package com.rajeev.generics;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomArrayList {
    private int[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;//also working as index value


    public CustomArrayList() {
        this.data = new int[DEFAULT_SIZE];
    }

    public void add(int num) {
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

        int[] temp = new int[data.length * 2];

        //copy the current items into the temp ara
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }

        data = temp;
    }

    public int remove() {
//        return data[--size];
        int removed = data[--size];
        return removed;
    }

    public int get(int index) {
        return data[index];
    }

    public int size() {
        return size;
    }

    public void set(int index, int daa) {
        data[index] = daa;
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

        for (int i = 0; i < 15; i++) {
            list.add(2 * i);
        }
        System.out.println(list);

        ArrayList<Integer> list2 = new ArrayList<>();
//        list2.add("11");

    }
}

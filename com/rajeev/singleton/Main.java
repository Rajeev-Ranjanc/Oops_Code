package com.rajeev.singleton;

public class Main {
    public static void main(String[] args) {

        single_ton obj = single_ton.getInstance();

        single_ton obj2 = single_ton.getInstance();

        single_ton obj3 = single_ton.getInstance();
    }

}

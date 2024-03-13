package com.rajeev.generics;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaFucntion {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            arr.add(i + 2);
        }
        arr.forEach((item) -> System.out.print(item * 2 + " "));

        Consumer<Integer> fun = (item) -> System.out.println(item * 2 + "  ");
        arr.forEach(fun);

        Operation sum = (a, b) -> a + b;
        Operation prod = (a, b) -> a * b;
        Operation sub = (a, b) -> a - b;
        LambdaFucntion mycalculator = new LambdaFucntion();
        System.out.println("Sum:"+mycalculator.operate(5,3,sum));
        System.out.println("Product:"+mycalculator.operate(5,3,prod));
        System.out.println("Subtraction:"+mycalculator.operate(5,3,sub));


    }
    private int operate(int a , int b , Operation op){
        return op.operation(a ,b);
    }

}

interface Operation {
    int operation(int a, int b);
}


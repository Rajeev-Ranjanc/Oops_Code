package com.rajeev.exceptionhandling;

public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        try {
//            System.out.println(a / b);
//            divide(a, b);
            //my own exeception
            String name = "rajeev";
            if (name.equals("rajeev")) {
                throw new MyException("name is rajeev");
            }
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (MyException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("normal exception");
        } finally {
            System.out.println("this block will execute always");
        }
    }

    static int divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("please do not divide by zero");
        }
        return a / b;
    }
}

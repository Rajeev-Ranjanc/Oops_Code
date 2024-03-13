package com.rajeev.interfaces;

public class ElenctricEngine implements Engine {
    @Override
    public void start() {
        System.out.println("Electric Engine Start");
    }

    @Override
    public void stop() {
        System.out.println("Electric Engine stop");
    }

    @Override
    public void acc() {
        System.out.println("Electric Engine Accelerate");
    }
}

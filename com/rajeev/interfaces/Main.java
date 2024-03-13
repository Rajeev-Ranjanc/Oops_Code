package com.rajeev.interfaces;

public class Main {
    public static void main(String[] args) {
//        Car car = new Car();
//        car.brake();
        Engine car = new Car();
//        car.a;
//        will throw an error because as we know accessing type will be of Engine class while calling will be of Car class
//        Inheritance Stuff
//        car.acc();
//        car.start();
//        car.stop();


//        Media carmedia = new Car();
//        this will be like you are stoping the music of the car but your car is going to be stop
//        to overcome this we should declare the specific class for the interfaces
//        carmedia.start();


        NiceCar nicecar = new NiceCar();
        nicecar.startMusic();
        nicecar.start();

    }
}

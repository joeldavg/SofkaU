package com.sofka.campus.poo;

public class CarMain {

    public static void main(String[] args) {
        CarBMW car;
        car = new CarBMW();
        car.powerOn();
        car.powerOff();
        System.out.println(car.getModel());
    }

}

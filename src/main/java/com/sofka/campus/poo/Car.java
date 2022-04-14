package com.sofka.campus.poo;

public class Car {

    //variables
    double weight;
    double high;
    double wide;
    double large;
    int doorsQuantity;
    String model;
    boolean start;

    //constructors
    public Car() {
        this.weight = 1000;
        this.high = 1.90;
        this.wide = 4;
    }

    //methods
    public double getWeight() {
        return this.weight;
    }

    public void powerOn() {
        this.start = true;
    }

    public void powerOff() {
        this.start = false;

    }

    public void status() {
        if (start) {
            System.out.println("The car is ON");
        } else {
            System.out.println("The car is OFF");
        }
    }

    public String getModel() {
        return this.model;
    }
}

class CarBMW extends Car {

    public CarBMW() {
        this.model = "BMW";
    }

    public void turbo() {
        System.out.println("Acabas de viajar a 100 millas por hora");
    }

}

class CarToyota extends Car {

    public CarToyota() {
        this.model = "Toyota";
    }

}

class Carrito extends CarToyota {

}
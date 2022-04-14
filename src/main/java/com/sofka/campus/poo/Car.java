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
        System.out.println("The car is ON");
    }

    public void powerOff() {
        this.start = false;
        System.out.println("The car is OFF");
    }

    public void status() {

        if (start) {
            System.out.println("The car is ON");
        } else {
            System.out.println("The car is OFF");
        }
    }

    public void information(){
        System.out.println("Este es un carro camun y corriente");
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

    @Override
    public void information() {
        System.out.println("Este es un BMW del año 2011");
    }
}

class CarToyota extends Car {

    public CarToyota() {
        this.model = "Toyota";
    }

    @Override
    public void information() {
        System.out.println("Este es una Toyota del año 2010");
    }
}

class Carrito extends CarToyota {

}
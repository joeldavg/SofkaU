package com.sofka.campus.poo;

public class Pelota {

    float radio;
    float peso;

    public Pelota() {
        this.radio = 300f;
        this.peso = 300f;
    }
    public Pelota(float radio, float peso) {
        this.radio = radio;
        this.peso = peso;
    }

    public float ObtenerRadio() {
        return radio;
    }

    public float ObtenerPeso() {
        return  peso;
    }

    public void patearPelota(){
        System.out.println("Haz pateado la pelota");
    }

    public void atraparPelota() {
        System.out.println("Haz atrapado la pelota");
    }

}

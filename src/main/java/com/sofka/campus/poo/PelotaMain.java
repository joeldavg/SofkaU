package com.sofka.campus.poo;

public class PelotaMain {

    public static void main(String[] args) {
        Pelota pelota = new Pelota(10f, 20f);
        float var = pelota.ObtenerPeso();
        pelota.patearPelota();
        pelota.atraparPelota();
    }

}

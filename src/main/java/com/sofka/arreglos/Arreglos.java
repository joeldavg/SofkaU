package com.sofka.arreglos;

public class Arreglos {

    public static void main(String[] args) {

        int x[] = new int[10];
        int y[] = {10, 5, 7};

        x[0] = 10;
        x[1] = 5;
        x[2] = 7;
        x[3] = 9;

        for (int i = 0; i < y.length; i++) {
            System.out.println("Arreglo en indice: " + i + " es igual a: " + y[i]);
        }

    }

}

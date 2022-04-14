package com.sofka.poo;

public class Operadores {

    enum Color {
        RED,
        BLUE
    }

    public static void main(String[] args) {
        Color color1 = Color.RED;
        Color color2 = Color.RED;

        if (color1 == color2) {
            System.out.println(" == ");
        }
        if (color1.equals(color2)) {
            System.out.println(" equals ");
        }
    }

}

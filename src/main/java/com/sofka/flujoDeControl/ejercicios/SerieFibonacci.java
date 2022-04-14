package com.sofka.flujoDeControl.ejercicios;

public class SerieFibonacci {

    public static void main(String[] args) {

        // serie fibonacci 0, 1, 1, 2, 3, 5, 8, 13, 21, 34

        int x = 1;
        int anterior = 0;
        int temp;
        while (true) {
            System.out.println(x);
            temp = x;
            x = x + anterior;
            anterior = temp;
            if (x > 100) {
                break;
            }
        }

    }

}

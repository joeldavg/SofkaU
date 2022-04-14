package com.sofka.campus.flujoDeControl;

public class While {

    public static void main(String[] args) {

        boolean cond = true;
        int x = 0;
        while (cond) {
            System.out.println("El valor de x es: " + x);
            x += 2;

            if (x > 8) {
                cond = false;
            }
        }

    }

}

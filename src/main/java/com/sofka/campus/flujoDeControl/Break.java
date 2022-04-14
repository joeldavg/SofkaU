package com.sofka.campus.flujoDeControl;

public class Break {

    public static void main(String[] args) {

        System.out.println("Ejemplo con break");
        for (int i = 0; i <= 5; i++) {

            if (i == 3) {
                break;
            }
            System.out.println("El valor de i es: " + i);
        }

        System.out.println("Ejemplo con continue");
        for (int i = 0; i <= 5; i++) {

            if (i == 3) {
                continue;
            }
            System.out.println("El valor de i es: " + i);
        }
        System.out.println("Has dejado el ciclo for");
    }

}

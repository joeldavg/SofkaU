package com.sofka.campus.texto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class VariablesDeTexto {

    public static void main(String[] args) {
        String texto = "";
        double x = 50.3;

        texto = String.valueOf(x);
        System.out.println("El valor de x en texto es: " + texto);

        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(in);

        try {
            System.out.println("Ingrese texto:");
            texto = buffer.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        texto = texto.concat("-Esto es uNa concAtenacion");
        texto = texto.toUpperCase(Locale.ROOT);

        System.out.println("El texto ingresado es: " + texto);

        int a = texto.length();
        System.out.println("La frase tiene " + a + " caracteres");

        try {
            System.out.println("Ingresar un numero");
            x = Integer.parseInt(buffer.readLine());
            System.out.println(x + 5);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

package com.sofka.operadores;

public class Strings {
    public static void main(String[] args) {
        String cadena = "El que se fue a Sevilla perdio su silla y el que se fue al Torreon, su sillon";

        System.out.println(cadena.charAt(0));
        System.out.println(cadena.charAt(11));
        System.out.println(cadena.endsWith("n"));
        System.out.println(cadena.startsWith("e"));
        System.out.println(cadena.equals("El que se fue a Sevilla perdio su silla y el que se fue al Torreon, su sillon"));

        byte[] arraysBytes = cadena.getBytes();

        System.out.println("Codigo ASCII de cada caracter");

        for (byte letra: arraysBytes) {
            System.out.print(letra + " ");
        }
        //--------------------------------------------------------

        String s1 = "spring ";
        String s2 = s1 + "summer ";
        System.out.println("\n" + s1.concat("fall "));
        System.out.println(s2.concat(s1));
        s1 += "winter";
        System.out.println(s1 + " " + s2);
    }
}

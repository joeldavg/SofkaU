package com.sofka.project;

import java.util.Scanner;

public class PrimerProyecto {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese los siguientes datos:");
        System.out.println("Nombre de usuario:");
        String nombreUsuario = scanner.nextLine();

        System.out.println("Celular:");
        String celular = scanner.nextLine();

        System.out.println("Edad:");
        String edad = scanner.nextLine();

        System.out.println("Bienvenido señor " + nombreUsuario + ", es un placer para nosotros contar con una persona" +
                " de " + edad + " años.\n" +
                "Próximamente nos comunicaremos con usted al numero " + celular + ".\n" +
                "Feliz día");

    }

}

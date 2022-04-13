package com.sofka.project;

import javax.swing.*;

public class HelloWorld {

    public static void main(String[] args) {

        String dato;

        dato = JOptionPane.showInputDialog("Ingrese un dato:");
        JOptionPane.showMessageDialog(null, "El dato ingresado es: " + dato);
    }
}


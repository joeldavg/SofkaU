package com.sofka.campus.project;

import javax.swing.*;

public class IngreseDato {

    public static void main(String[] args) {

        String dato;

        dato = JOptionPane.showInputDialog("Ingrese un dato:");
        JOptionPane.showMessageDialog(null, "El dato ingresado es: " + dato);
    }
}


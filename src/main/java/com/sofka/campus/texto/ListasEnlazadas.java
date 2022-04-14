package com.sofka.campus.texto;

import java.util.LinkedList;

public class ListasEnlazadas {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.add("Palabra");
        list.add(5);
        list.add(17);
        list.add("palabra 2");
        list.removeLast();

        System.out.println("El tamaño de la lista es: " + list.size());
        System.out.println(list);

    }

}

package com.sofka.campus.funcional.collections;

import java.util.*;

public class CollectionApp {

    private List<String> lista;

    public void llenarLista() {
        lista = new ArrayList<>();

        lista.add("MitoCode");
        lista.add("Mito");
        lista.add("Code");
    }

    public void usarForEach() {
        /*for (String elemento : lista) {
            System.out.println(elemento);
        }*/

//        lista.forEach(x -> System.out.println(x));
        lista.forEach(System.out::println);
    }

    public void usarRemoveIf() {
        /*Iterator<String> iterator = lista.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().equalsIgnoreCase("Code")){
                iterator.remove();
            }
        }*/

        lista.removeIf(x -> x.equalsIgnoreCase("Code"));
    }

    public void usarSort() {
        lista.sort((x, y) -> x.compareTo(y));
    }

    public static void main(String[] args) {
        CollectionApp app = new CollectionApp();
        app.llenarLista();
        app.usarForEach();
        app.usarSort();
        System.out.println();
        app.usarForEach();
        System.out.println();
        app.usarRemoveIf();
        app.usarForEach();
    }

}

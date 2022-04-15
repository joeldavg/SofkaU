package com.sofka.campus.funcional.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class StreamsApp {

    private List<String> lista;
    private List<String> numeros;

    public StreamsApp() {
        lista = new ArrayList<>();
        lista.add("Mito");
        lista.add("Code");
        lista.add("Joel");
        lista.add("Hello");

        numeros = new ArrayList<>();
        numeros.add("1");
        numeros.add("2");
        numeros.add("3");
        numeros.add("4");
    }

    public void filtrar() {
        lista.stream().filter(x -> x.startsWith("M")).forEach(System.out::println);
    }

    public void ordenar() {
        //lista.stream().sorted().forEach(System.out::println);
        lista.stream().sorted((x, y) -> y.compareTo(x)).forEach(System.out::println);
    }

    public void transformar() {
        /*lista.stream().map(String::toUpperCase).forEach(System.out::println);
        for (String x : numeros) {
            int num = Integer.parseInt(x) +1;
            System.out.println(num);
        }*/

        numeros.stream().map(x -> Integer.parseInt(x) + 1).forEach(System.out::println);

    }

    public void limitar() {
        lista.stream().limit(3).forEach(System.out::println);
    }

    public void contar() {
        long i = lista.stream().filter(x -> x.contains("t")).count();
        System.out.println(i);
    }

    public static void main(String[] args) {
        StreamsApp app = new StreamsApp();
//        app.filtrar();
//        app.ordenar();
//        app.transformar();
//        app.limitar();
        app.contar();
    }

}

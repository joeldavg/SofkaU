package com.sofka.campus.funcional.highOrder;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class HighApp {

    private Function<String, String> convertirMayusculas = x -> x.toUpperCase();
    private Function<String, String> convertirMinusculas = x -> x.toLowerCase();

    public void imprimir(Function<String, String> function, String valor) {
        System.out.println(function.apply(valor));
    }

    public Function<String, String> mostrar(String mensaje) {
        return (String x) -> mensaje + x;
    }

    public void filtrar(List<String> lista, Consumer<String> consumidor, int longitud, String cadena) {
        lista.stream().filter(this.establecerLogicaFiltro(longitud)).forEach(consumidor);
        lista.stream().filter(this.establecerLogicaFiltro(cadena)).forEach(consumidor);
    }

    public Predicate<String> establecerLogicaFiltro(int longitud) {
        return text -> text.length() < longitud;
    }

    public Predicate<String> establecerLogicaFiltro(String cadena) {
        return text -> text.contains(cadena);
    }

    public static void main(String[] args) {
        HighApp app = new HighApp();
        /*app.imprimir(app.convertirMayusculas, "mitocode");
        app.imprimir(app.convertirMinusculas, "MITOCODE");

        String resp = app.mostrar("hola ").apply("mitocode");
        System.out.println(resp);*/

        List<String> lista = new ArrayList<>();
        lista.add("Mito");
        lista.add("Code");
        lista.add("MitoCode");
        lista.add("Joel");

//        app.filtrar(lista, System.out::println, 5, null);
        app.filtrar(lista, System.out::println, 0, "Code");

    }

}

package com.sofka.campus.funcional.methodReference;

import java.util.Arrays;
import java.util.Comparator;

public class MeRefApp {

    public static void referenciarMetodoStatic() {
        System.out.println("Método Referido static");
    }

    public void referenciarMetodoInstaciaObjectoArtitrario() {
        String[] nombres = {"Mito", "Code", "Joel", "Hello"};

        /*Arrays.sort(nombres, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareToIgnoreCase(o2);
            }
        });*/

//        Arrays.sort(nombres, (s1, s2) -> s1.compareToIgnoreCase(s2));

        Arrays.sort(nombres, String::compareToIgnoreCase);
        System.out.println(Arrays.toString(nombres));
    }

    public void referenciarMetodoInstanciaObjectoParticular() {
        System.out.println("Método Referido Instancia de un Objeto en Particular");
    }

    public void referenciarConstructor() {
        /*IPersona iPersona = new IPersona() {
            @Override
            public Persona crear(int id, String nombre) {
                return new Persona(id, nombre);
            }
        };
        iPersona.crear(1, "Joel");*/

        //Lambda
        /*IPersona iPersona1 = (x, y) -> (new Persona(x, y));
        Persona persona = iPersona1.crear(1, "Joel");
        System.out.println(persona);*/

        //Metodo Referencia
        IPersona iPersona2 = Persona::new;
        Persona persona = iPersona2.crear(2, "Joel");
        System.out.println(persona);
    }

    public void operar() {
        Operacion op = () -> MeRefApp.referenciarMetodoStatic();
        op.saludar();

        Operacion op2 = MeRefApp::referenciarMetodoStatic;
        op.saludar();
    }

    public static void main(String[] args) {
        MeRefApp app = new MeRefApp();

        /*app.referenciarMetodoInstaciaObjectoArtitrario();
        Operacion op = app::referenciarMetodoInstanciaObjectoParticular;
        op.saludar();*/

        app.referenciarConstructor();
    }

}

package com.sofka.campus.funcional.methodReference;

@FunctionalInterface
public interface IPersona {
    Persona crear(int id, String nombre);
}

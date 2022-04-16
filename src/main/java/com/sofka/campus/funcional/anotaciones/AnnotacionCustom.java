package com.sofka.campus.funcional.anotaciones;

public @interface AnnotacionCustom {

    String nombre();
    boolean habilitado() default true;

}

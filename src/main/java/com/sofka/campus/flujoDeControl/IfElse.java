package com.sofka.campus.flujoDeControl;

public class IfElse {
    /*
        >, >=, <, <=, ==, !=, ||, &&
     */
    public static void main(String[] args) {
        int var = 6;
        int var2 = 10;
        boolean cond;

        if ( !((var == 6) || (var2 > 5)) ) {
            cond = true;
        } else {
            cond = false;
        }
        if (cond) {
            System.out.println("Tu operacion es verdadera");
        } else {
            System.out.println("Tu operacion es falsa");
        }

    }

}

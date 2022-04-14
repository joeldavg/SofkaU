package com.sofka.flujoDeControl;

public class Switch {

    public static void main(String[] args) {
        //switch(int or char)

        char x = 'b';
        switch (x) {
            case 'a':
                System.out.println("Esta es la opcion " + x);
                break;
            case 'b':
                System.out.println("Esta es la opcion " + x);
                break;
            default:
                System.out.println("Esta es la opcion default");
                break;
        }

    }

}

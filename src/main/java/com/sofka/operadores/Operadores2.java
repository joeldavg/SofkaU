package com.sofka.operadores;

public class Operadores2 {

    public static void main(String[] args) {
        A a = new A();
        B b = new B();

        // the following are true
        System.out.println(a instanceof Foo);
        System.out.println(b instanceof A);
        System.out.println(b instanceof Foo);
    }

}

interface Foo {}
class A implements Foo {}
class B extends A {}
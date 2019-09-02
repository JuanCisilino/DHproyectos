package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Reptil reptilion = new Reptil();
        Mamifero mamu = new Mamifero();
        PezVolador pezqui = new PezVolador();

        Animal rondaDeMate = new Animal();

        rondaDeMate.agregarCebado(reptilion);
        rondaDeMate.agregarCebado(mamu);
        rondaDeMate.agregarCebado(pezqui);

        rondaDeMate.ronda();
    }
}

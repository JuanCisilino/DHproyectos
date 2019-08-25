package com.company;

import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
	// write your code here
        HashSet<Integer> listasetdeNumeros = new HashSet<>();

        listasetdeNumeros.add(1);
        listasetdeNumeros.add(5);
        listasetdeNumeros.add(5);
        listasetdeNumeros.add(6);
        listasetdeNumeros.add(7);
        listasetdeNumeros.add(8);
        listasetdeNumeros.add(8);
        listasetdeNumeros.add(8);

        System.out.println(listasetdeNumeros);


    }
}

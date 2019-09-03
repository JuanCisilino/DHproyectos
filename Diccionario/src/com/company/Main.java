package com.company;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Map<Integer, String> diccionario = new HashMap<>();

        diccionario.put(0, " Huevos");
        diccionario.put(1, " Agua");
        diccionario.put(2, " Escopeta");
        diccionario.put(3, " Caballo");
        diccionario.put(4, " Dentista");
        diccionario.put(5, " Llamas");

        for (Integer clave:diccionario.keySet()) {

            System.out.println( clave + diccionario.get(clave));
        }
    }
}

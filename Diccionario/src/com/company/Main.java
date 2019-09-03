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

        Map<String, String> diccionarioDeApodos = new HashMap<>();

        diccionarioDeApodos.put("Juan:", " Juancho, Fisura, Ricardo Fort");
        diccionarioDeApodos.put("Miguel:", " Night Watch, Bruce Wayne, Pati Corti");
        diccionarioDeApodos.put("Maria:", " Wonder Woman, Mary, Roberto");
        diccionarioDeApodos.put("Lucas:", " Luks, Jorge, Chorch");


        for (String clave : diccionarioDeApodos.keySet()) {

            System.out.println( clave + diccionarioDeApodos.get(clave));
        }
    }
}

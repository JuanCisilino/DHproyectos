package com.company;

import java.util.ArrayList;

public class Main {

    /*
     * Arreglar la siguiente función, la cual recibe un array de números enteros,
     * para que retorne el promedio de los valores impares dentro del array recibido.
     */

    Integer promedioSoloImpares(ArrayList<Integer> listaDeEnteros){
        ArrayList<Integer> listaDeImpares = new ArrayList<>();
        Integer total = 0;
        for (Integer i = 0 ; i < listaDeEnteros.size() ; i++){
            if (listaDeEnteros.get(i) % 2 == 0) {
                listaDeImpares.add(listaDeEnteros.get(i));
                total = total + listaDeEnteros.get(i);
            }
        }


        return total / listaDeImpares.size() ;
    }



    //--------------------------------------------NO CAMBIAR NADA DE ACÁ PARA ABAJO--------------------------------------------



    public static void main(String[] args){

        Main ejercicio2 = new Main();

        //Test 1
        ArrayList<Integer> array1 = new ArrayList<>();
        array1.add(1);
        array1.add(2);
        array1.add(4);
        array1.add(7);

        System.out.println(ejercicio2.promedioSoloImpares(array1));

        //Test 2
        ArrayList<Integer> array2 = new ArrayList<>();
        array2.add(1);
        array2.add(0);
        array2.add(103);

        System.out.println(ejercicio2.promedioSoloImpares(array2));

        //Test 3
        ArrayList<Integer> array3 = new ArrayList<>();
        array3.add(-1);
        array3.add(-2);
        array3.add(14);
        array3.add(0);

        System.out.println(ejercicio2.promedioSoloImpares(array3));

    }
}

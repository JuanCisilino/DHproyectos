package Ejercitacion2;

import java.util.ArrayList;

/**
 * Created by andres on 31/03/16.
 */
public class Ejercicio4 {


    public ArrayList<Integer> primerosCienNumeros(){
        //Comenzar a escribir código acá

        ArrayList<Integer>NumerosImpares = new ArrayList<>();
        for (Integer i = 0 ; i < 100 ; i++) {
            if (i % 2 != 0) {
                NumerosImpares.add(i);
            }
        }
        return NumerosImpares;
        }

    //No cambiar nada de aca hacia abajo
    public static void main(String[] args){
        //Test
        Ejercicio4 ejercicio4 = new Ejercicio4();
        ejercicio4.primerosCienNumeros();
    }
}
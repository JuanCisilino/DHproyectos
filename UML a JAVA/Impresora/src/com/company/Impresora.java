package com.company;

import java.util.ArrayList;

public class Impresora {

    private ArrayList<Imprimible> listaDeImpresion = new ArrayList<>();

    public void anadiralaCola (Imprimible unImprimible) {
        listaDeImpresion.add(unImprimible);
    }

    public void imprimir(){
        for (Integer i = 0 ; i < listaDeImpresion.size(); i++) {
            Imprimible unImprimible = listaDeImpresion.get(i);
            unImprimible.imprimir();
        }
    }

}

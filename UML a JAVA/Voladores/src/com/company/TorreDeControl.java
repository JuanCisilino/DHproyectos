package com.company;

import java.util.ArrayList;

public class TorreDeControl {

    private ArrayList<Volable> listaDeVolables = new ArrayList<>();

    public void vuelanTodos(){
        for (int i = 0 ; i < listaDeVolables.size() ; i++){
            Volable unVolable = listaDeVolables.get(i);
            unVolable.volar();
        }
    }

    public void agregadoaVolar(Volable unVolable){
        listaDeVolables.add(unVolable);
    }
}

package com.company;

import java.util.ArrayList;

public class FuegosEnPacks{

    private ArrayList<Explotables> listaDeExplotables = new ArrayList<>();

    public void explotar(){
        for (Integer i = 0 ; i < listaDeExplotables.size() ; i++){
            Explotables unExplotable = listaDeExplotables.get(i);
            unExplotable.explotar();
        }
    }

}

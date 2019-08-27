package com.company;

import java.util.ArrayList;
import java.util.List;

public class FuegosEnPacks implements Explotables{

    private List<Explotables> listaDeExplotables ;


    public void agregarExplotable(Explotables explotables) {
        listaDeExplotables.add(explotables);
    }

    @Override
    public void comienzo() {

    }

    public void explotar(){
        for (Explotables unExplotable: listaDeExplotables) {
            unExplotable.explotar();
        }
    }

}

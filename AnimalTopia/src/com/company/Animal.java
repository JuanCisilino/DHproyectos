package com.company;

import java.util.ArrayList;
import java.util.List;

public class Animal {

    private List<Cebador> rondaDeMate;

    public Animal() {
        this.rondaDeMate = new ArrayList<>();
    }

    public void agregarCebado(Cebador unCebado) {
        rondaDeMate.add(unCebado);
    }

    public void ronda(){
        for (Integer i = 0 ; i < rondaDeMate.size(); i++){
            Cebador unCebado = rondaDeMate.get(i);
            unCebado.cebar();
        }
    }

}

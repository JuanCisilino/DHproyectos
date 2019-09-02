package com.company;

import java.util.ArrayList;
import java.util.List;

public class Animal implements Cebador {

    private String nombre;
    private List<Animal> rondaDeMate;

    public void  Animal(String nombre) {
        this.nombre = nombre;
        this.rondaDeMate = new ArrayList<>();
    }

    public void setRondaDeMate(Animal nombre) {
        rondaDeMate.add(nombre);
    }

    @Override
    public void cebar() {

    }
}

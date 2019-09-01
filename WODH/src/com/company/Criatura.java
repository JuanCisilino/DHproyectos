package com.company;

import java.util.Random;

public abstract class Criatura {

    Random aleatorio = new Random();
    private Integer nivelDeAtaque;

    public Criatura(Integer nivelDeAtaque){

        this.nivelDeAtaque = aleatorio.nextInt(100);
    }

    public Integer getNivelDeAtaque() {
        return nivelDeAtaque;
    }
}


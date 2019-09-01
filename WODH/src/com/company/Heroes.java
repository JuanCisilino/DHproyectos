package com.company;

import java.util.Random;

public abstract class Heroes {

    Random aleatorio = new Random();
    private Integer nivelDeExperiencia;

    public Heroes(Integer nivelDeExperiencia){
        this.nivelDeExperiencia = aleatorio.nextInt(50);
    }

    protected Heroes() {
    }

    public void luchar(Criatura unaCriatura){

    }

    public Integer getNivelDeExperiencia() {
        return nivelDeExperiencia;
    }

    public void setNivelDeExperiencia(Integer nivelDeExperiencia) {
        this.nivelDeExperiencia = nivelDeExperiencia;
    }
}

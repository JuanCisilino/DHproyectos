package com.company;

import java.util.Random;

public class Mago extends Heroes {

    public Mago(Integer nivelDeExperiencia) {

        super(nivelDeExperiencia);
    }

    public void resucitarAGuerrero(Guerrero unGuerrero){
        if(unGuerrero.getNivelDeExperiencia() <= this.getNivelDeExperiencia()){
            unGuerrero.setNivelDeVida(20);
            System.out.println("El Mago ha resucitado al Guerrero,\n de nada XD!!");
        }
    }

    public void ganador(){
        System.out.println("El mago ha ganado!!!");
    }


    public void perdedor(){
        System.out.println("El mago ha perdido!!!");
    }

    @Override
    public void luchar(Criatura unaCriatura) {
        if(unaCriatura.getNivelDeAtaque() < this.getNivelDeExperiencia()){
            this.setNivelDeExperiencia(getNivelDeExperiencia() + 2);
            ganador();
        }else{
            this.setNivelDeExperiencia(getNivelDeExperiencia() - 1);
            perdedor();
        }
    }
}
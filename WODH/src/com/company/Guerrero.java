package com.company;

import java.nio.charset.IllegalCharsetNameException;

class Guerrero extends Heroes {

    private Integer nivelDeVida;

    public Guerrero(Integer nivelDeExperiencia) {
        super(nivelDeExperiencia);
        this.nivelDeVida = 50;
    }

    public void setNivelDeVida(Integer nivelDeVida) {
        this.nivelDeVida = nivelDeVida;
    }

    public Integer getNivelDeVida() {
        return nivelDeVida;
    }

    public void muerto(){
        System.out.println("El guerrero esta muerto. Debera esperar su resurreccion");
    }

    public void ganador(){
        System.out.println("El guerrero ah ganado!!!!!");
    }

    public void perdedor(){
        System.out.println("El guerrero ah muerto... por ende ah perdido XD!!");
    }

    @Override
    public void luchar(Criatura unaCriatura) {
        if(this.nivelDeVida == 0){
            muerto();
        }else if (unaCriatura.getNivelDeAtaque() < this.getNivelDeExperiencia()) {
            setNivelDeVida(getNivelDeExperiencia() + 1);
            ganador();
        }else{
            this.nivelDeVida = 0;
            perdedor();
        }
    }
}

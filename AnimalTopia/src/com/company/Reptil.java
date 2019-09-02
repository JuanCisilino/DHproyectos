package com.company;

public class Reptil extends Animal implements Cebador{

    private String nombre;
    private Integer energiaReptil;

    public Reptil(String nombre) {
        this.nombre = nombre;
        this.energiaReptil = 2;
    }

    public Integer getEnergiaReptil() {
        return energiaReptil;
    }

    @Override
    public void cebar() {
        energiaReptil = energiaReptil * 2;
        System.out.println("Esta mas bueno que susana en los 80s!!");
        System.out.println("Tu energia Reptiliana es de " + getEnergiaReptil());
    }
}

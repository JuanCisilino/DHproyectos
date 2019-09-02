package com.company;

public class Reptil implements Cebador{

    private Integer energiaReptil;

    public Reptil() {
        this.energiaReptil = 10;
    }

    public Integer getEnergiaReptil() {
        return energiaReptil;
    }

    @Override
    public void cebar() {
        energiaReptil = energiaReptil * 2;
        System.out.println("(\nEsta mas bueno que susana en los 80s!!");
        System.out.println("Tu energia Reptiliana es de " + getEnergiaReptil());
    }
}

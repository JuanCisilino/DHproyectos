package com.company;

public class PezVolador implements Cebador {

    private Integer energiaPez;

    public PezVolador() {
        this.energiaPez = 10;
    }

    public Integer getEnergiaPez() {
        return energiaPez;
    }

    @Override
    public void cebar() {
        energiaPez = energiaPez + 1;
        System.out.println("\nEsta mas bueno que aquaman sin mallas!!");
        System.out.println("Tu energia de Pez Volador es de " + getEnergiaPez());

    }
}

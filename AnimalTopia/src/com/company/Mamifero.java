package com.company;

public class Mamifero implements Cebador{

    private Integer energiaMamifero;

    public Mamifero(){
        this.energiaMamifero = 10;
    }

    public Integer getEnergiaMamifero() {
        return energiaMamifero;
    }

    @Override
    public void cebar() {
        energiaMamifero = energiaMamifero + 5;
        System.out.println("\nEsta mas bueno que mirtha en los 20s!!");
        System.out.println("Tu energia de Mamifero es de " + getEnergiaMamifero());

    }
}

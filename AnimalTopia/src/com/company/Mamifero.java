package com.company;

public class Mamifero extends Animal implements Cebador{

    private String nombre;
    private Integer energiaMamifero;

    public Mamifero(String nombre){
        this.nombre = nombre;
        this.energiaMamifero = 10;
    }

    public Integer getEnergiaMamifero() {
        return energiaMamifero;
    }

    @Override
    public void cebar() {
        energiaMamifero = energiaMamifero + 5;
        System.out.println("Esta mas bueno que mirtha en los 20s!!");
        System.out.println("Tu energia Reptiliana es de " + getEnergiaMamifero());

    }
}

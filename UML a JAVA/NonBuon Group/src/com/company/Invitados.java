package com.company;

public abstract class Invitados {

    private String nombre;
    private Integer dni;

    public Invitados(String nombre, Integer dni) {
        this.dni = dni;
        this.nombre = nombre;
    }

    public abstract void comer();

}

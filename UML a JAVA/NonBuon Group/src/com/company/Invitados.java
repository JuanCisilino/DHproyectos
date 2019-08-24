package com.company;

public class Invitados {

    private String nombre;
    private Integer dni;

    public Invitados(String nombre, Integer dni){
        this.dni = dni;
        this.nombre = nombre;
    }

    public void comer(){
        System.out.println("Niam Niam esta rico esto...");
    }
}

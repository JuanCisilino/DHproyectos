package com.company;

public class Persona {  //UpperCamelCase

    //ATRIBUTOS     visibilidad tipoDeDato nombreAtributo
    private String nombre;
    private Perro unPerro; //lowerCamelCase

    public Persona(String nombre,Perro unPerro){
        this.nombre = nombre;
        this.unPerro = unPerro;
    }

    //MÉTODOS       visibilidad tipoDeDatoRetorno nombreMetodo(tipoDeDato paremetro){}
    public void pasearPerro(Integer cuadras){
        for(int i = 1 ; i <= cuadras ; i++){
            unPerro.caminar();
            System.out.println("Caminamos "+i+" cuadras.");
        }
    }
}

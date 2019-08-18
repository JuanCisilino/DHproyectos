package com.company;

public class Perro {

    //ATRIBUTOS     visibilidad tipoDeDato nombreAtributo
    private String nombre;
    private Integer energia;

    //CONSTRUCTOR
    public Perro(String nombreDelPerro){
        nombre = nombreDelPerro;
        energia = 100;
    }

    //MÉTODOS       visibilidad tipoDeDatoRetorno nombreMetodo(tipoDeDato paremetro){}
    public void caminar(){
        if(energia >= 10){
            energia = energia - 5;
        } else {
            ladrar();
        }


    }

    public void ladrar(){
        System.out.println("¡WUUF, WUUF!");
    }

    //GETTERS Y SETTER
    public String obtenerNombre(){
        return nombre;
    }

   /* public void modificarNombre(String nuevoNombre){
        nombre = nuevoNombre;
    }*/

}

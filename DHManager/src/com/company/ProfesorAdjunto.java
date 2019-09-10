package com.company;

public class ProfesorAdjunto extends Profesor {

    private Integer cantidadDeHoras;

    public ProfesorAdjunto(String nombre, String apellido, Integer codigoProfesor, Integer cantidadDeHoras) {
        super(nombre, apellido, codigoProfesor);
        this.cantidadDeHoras = cantidadDeHoras;
    }


}

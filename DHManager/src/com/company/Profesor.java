package com.company;

public class Profesor {

    private String nombre;
    private String apellido;
    private Integer antiguedad;
    private Integer codigoProfesor;

    public Profesor(String nombre, String apellido, Integer codigoProfesor) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.codigoProfesor = codigoProfesor;
        this.antiguedad = 0;
    }

    public Integer getCodigoProfesor() {
        return codigoProfesor;
    }

    @Override
    public boolean equals(Object obj) {
        Profesor unProfesor = (Profesor) obj;
        return unProfesor.codigoProfesor.equals(this.codigoProfesor);
    }

}

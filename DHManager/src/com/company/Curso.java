package com.company;

import java.util.ArrayList;
import java.util.List;

public class Curso extends DigitalHouseManagment{

    private String nombre;
    private Integer codigoDeCurso;
    private Integer cupoMaximo;
    private Profesor unProfesorTitular;
    private Profesor unProfesorAdjunto;

    public Curso(String nombre, Integer codigoDeCurso, Integer cupoMaximo) {
        this.nombre = nombre;
        this.codigoDeCurso = codigoDeCurso;
        this.cupoMaximo = cupoMaximo;
        this.unProfesorTitular = unProfesorTitular;
        this.unProfesorAdjunto = unProfesorAdjunto;
    }

    public String getNombre() {
        return nombre;
    }

    public Boolean hayCupo(Integer codigoCurso) { return ((getListaDeAlumnos().size()-1) < cupoMaximo); }

    public Integer getCodigoDeCurso() {
        return codigoDeCurso;
    }

    public void setUnProfesorTitular(Profesor unProfesorTitular) {
        this.unProfesorTitular = unProfesorTitular;
    }

    public void setUnProfesorAdjunto(Profesor unProfesorAdjunto) {
        this.unProfesorAdjunto = unProfesorAdjunto;
    }


    public Boolean agregarUnAlumno(Alumno unAlumno) {
      return (getListaDeAlumnos().size()) < cupoMaximo ;
    }

    public void eliminarAlumno(Alumno unAlumno) {
        getListaDeAlumnos().remove(unAlumno);
    }

    public Integer getCupoMaximo(Integer codigoDeCurso) {
        return cupoMaximo;
    }

    public Profesor getUnProfesorTitular() {
        return unProfesorTitular;
    }

    public Profesor getUnProfesorAdjunto(Integer codigoProfesorAdjunto) {
        return unProfesorAdjunto;
    }

    @Override
    public boolean equals(Object obj) {
        Curso unCurso = (Curso) obj;
        return unCurso.codigoDeCurso.equals(this.codigoDeCurso);
    }
}

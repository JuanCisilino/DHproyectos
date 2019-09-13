package com.company;

import java.util.ArrayList;
import java.util.List;

public class Curso{

    private String nombre;
    private Integer codigoDeCurso;
    private Integer cupoMaximo;
    private List<Alumno> listaDeAlumnosDelCurso;
    private Profesor unProfesorTitular;
    private Profesor unProfesorAdjunto;

    public Curso(String nombre, Integer codigoDeCurso, Integer cupoMaximo) {
        this.nombre = nombre;
        this.codigoDeCurso = codigoDeCurso;
        this.cupoMaximo = cupoMaximo;
        this.listaDeAlumnosDelCurso = new ArrayList<>();
    }


    public Boolean hayCupo() { return (listaDeAlumnosDelCurso.size() < cupoMaximo); }


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
      return listaDeAlumnosDelCurso.add(unAlumno);
    }


    @Override
    public boolean equals(Object obj) {
        Curso unCurso = (Curso) obj;
        return unCurso.codigoDeCurso.equals(this.codigoDeCurso);
    }
}

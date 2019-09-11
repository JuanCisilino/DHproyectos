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

    public String getNombre() {
        return nombre;
    }

    public Boolean hayCupo() { return (listaDeAlumnosDelCurso.size() < cupoMaximo); }

    public List<Alumno> getListaDeAlumnosDelCurso() {
        return listaDeAlumnosDelCurso;
    }

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

    public void eliminarAlumno(Alumno unAlumno) {
        listaDeAlumnosDelCurso.remove(unAlumno);
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

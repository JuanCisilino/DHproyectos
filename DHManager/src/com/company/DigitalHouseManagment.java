package com.company;

import java.util.*;

public class DigitalHouseManagment {

    private List<Alumno> listaDeAlumnos;
    private Set<Profesor> listaDeProfesores;
    private Set<Curso> listaDeCursos;
    private List<Inscripcion> listaDeInscriptos;
    private Integer cupoMaximo = null;
    private String nombre = null;
    private Integer codigoDeCurso = null;

    public DigitalHouseManagment() {

        this.listaDeAlumnos = new ArrayList<>();
        this.listaDeProfesores = new HashSet<>();
        this.listaDeCursos = new HashSet<>();
        this.listaDeInscriptos = new ArrayList<>();

    }

    public void altaCurso(String nombre, Integer codigoCurso, Integer cupoMaximo){
        listaDeCursos.add(new Curso(nombre, codigoCurso, cupoMaximo));
        System.out.println("Curso " + nombre + " creado");
    }

    public void bajaCurso(Integer codigoCurso) {
        listaDeCursos.remove(codigoCurso);
        System.out.println("Curso dado de baja");
    }

    public void altaProfesorAdjunto(String nombre, String apellido, Integer codigoProfesor, Integer cantidadDeHoras) {
        if (listaDeProfesores.contains(codigoProfesor)) {
            System.out.println("Profesor ya en nuestra base de datos");
        } else {
            listaDeProfesores.add(new ProfesorAdjunto(nombre, apellido, codigoProfesor, cantidadDeHoras));
            System.out.println("Bienvenido Profesor Adjunto " + nombre + " a DH");
        }
    }

    public void altaProfesorTitular(String nombre, String apellido, Integer codigoProfesor, String especialidad) {
        if (listaDeProfesores.contains(codigoProfesor)) {
            System.out.println("Profesor ya en nuestra base de datos");
        } else {
            listaDeProfesores.add(new ProfesorTitular(nombre, apellido, codigoProfesor, especialidad));
            System.out.println("Bienvenido Profesor Titular " + nombre + " a DH");
        }
    }

    public void bajaProfesor(Integer codigoProfesor) {
        listaDeProfesores.remove(codigoProfesor);
        System.out.println("\nProfesor dado de baja");
    }

    public void altaAlumno(String nombre, String apellido, Integer codigoAlumno) {
        if (listaDeAlumnos.contains(codigoAlumno)){
            System.out.println("Alumno ya en nuestra base de datos");
        } else {
            listaDeAlumnos.add(new Alumno(nombre, apellido, codigoAlumno));
            System.out.println("Bienvenido " + nombre + " a DH");
        }
    }

    private boolean buscarCurso(Integer codigoCurso) {
        for (Curso curso:listaDeCursos) {
            return curso.getCodigoDeCurso().equals(codigoCurso);
        }
        return false;
    }

    public void inscribirAlumno(Integer codigoAlumno, Integer codigoCurso) {
        if (hayCupo(codigoCurso) == true) {
            listaDeInscriptos.add(new Inscripcion(codigoAlumno, codigoCurso, new Date()));
            System.out.println("Inscripcion completada" );
        } else {
            System.out.println("No hay cupo!!");
        }
    }

    private Profesor buscarProfesor(Integer codigoProfesor){
        Profesor profesorBuscado = null;
        for (Profesor unProfesor: listaDeProfesores) {
            if (unProfesor.getCodigoProfesor().equals(unProfesor)) {
                profesorBuscado = unProfesor;
            }
        }
        return profesorBuscado;
    }

    public void asignarProfesores(Integer codigoCurso, Integer codigoProfesorTitular, Integer codigoProfesorAdjunto) {
        if (buscarCurso(codigoCurso) == true) {
            Profesor setUnProfesorAdjunto = buscarProfesor(codigoProfesorAdjunto);
            Profesor setUnProfesorTitular = buscarProfesor( codigoProfesorTitular);
            System.out.println("Profesores Asignados!");
        }
    }

    public Boolean hayCupo(Integer codigoCurso) {
    for (Curso curso:listaDeCursos) {
            cupoMaximo = curso.getCupoMaximo(codigoCurso);
        }
        return listaDeInscriptos.size() < cupoMaximo;
    }

    public List<Alumno> getListaDeAlumnos() {
        return listaDeAlumnos;
    }
}


package com.company;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.*;

public class DigitalHouseManagment {

    private List<Alumno> listaDeAlumnos;
    private List<Profesor> listaDeProfesores;
    private List<Curso> listaDeCursos;
    private List<Inscripcion> listaDeInscriptos;
    private Integer cupoMaximo;
    private Integer codigoAlumno;

    public DigitalHouseManagment() {
        this.codigoAlumno = 197;
        this.listaDeAlumnos = new ArrayList<>();
        this.listaDeProfesores = new ArrayList<>();
        this.listaDeCursos = new ArrayList<>();
        this.listaDeInscriptos = new ArrayList<>();

    }

    public void altaCurso(String nombre, Integer codigoCurso, Integer cupoMaximo){

        listaDeCursos.add(new Curso(nombre, codigoCurso, cupoMaximo));
        System.out.println("Curso " + nombre + " creado");
    }

    public void bajaCurso(Integer codigoCurso) {
        Curso cursoBuscado = buscarCurso(codigoCurso);
       if (listaDeCursos.remove(cursoBuscado)){
           System.out.println("Curso dado de baja correctamente");
       } else {
           System.out.println("No se ah podido dar de baja el Curso");
       }
    }

    public void altaProfesorAdjunto(String nombre, String apellido, Integer codigoProfesor, Integer cantidadDeHoras) {
        Profesor profesorNuevo = new ProfesorAdjunto(nombre, apellido, codigoProfesor, cantidadDeHoras);
        if (listaDeProfesores.contains(profesorNuevo)) {
            System.out.println("Profesor ya en nuestra base de datos");
        } else {
            listaDeProfesores.add(profesorNuevo);
            System.out.println("Bienvenido Profesor Adjunto " + nombre + " a DH");
        }
    }

    public void altaProfesorTitular(String nombre, String apellido, Integer codigoProfesor, String especialidad) {
        Profesor profesorNuevo= new ProfesorTitular(nombre, apellido, codigoProfesor, especialidad);
        if (listaDeProfesores.contains(profesorNuevo)) {
            System.out.println("Profesor ya en nuestra base de datos");
        } else {
            listaDeProfesores.add(profesorNuevo);
            System.out.println("Bienvenido Profesor Titular " + nombre + " a DH");
        }
    }

    public void bajaProfesor(Integer codigoProfesor) {
        Profesor profesorAEliminar = buscarProfesor(codigoProfesor);
        listaDeProfesores.remove(profesorAEliminar);
        System.out.println("\nProfesor dado de baja");
    }

    public void altaAlumno(String nombre, String apellido, Integer codigoAlumno) {

        if(listaDeAlumnos.add(new Alumno(nombre, apellido, codigoAlumno))){
            System.out.println("Bienvenido " + nombre + " a DH");
        } else {
            System.out.println("Alumno ya en nuestra base de datos");
        }
    }

    private Curso buscarCurso(Integer codigoCurso) {
        Curso cursoBuscado = null;
        for (Curso unCurso: listaDeCursos) {
            if (unCurso.getCodigoDeCurso().equals(codigoCurso)){
                cursoBuscado = unCurso;
            }
        }
        return cursoBuscado;
    }

    private boolean buscarCupo(Integer codigoCurso) {
        Curso cursoBuscado = null;
        for (Curso unCurso: listaDeCursos) {
            if (unCurso.getCodigoDeCurso().equals(codigoCurso)){
    cursoBuscado = unCurso;
            }
        }
        return cursoBuscado.hayCupo();
    }

    public void inscribirAlumno(Integer codigoAlumno, Integer codigoCurso) {
        Curso cursoBuscado = buscarCurso(codigoCurso);
        Alumno alumnoBuscado = buscarAlumno(codigoAlumno);
        if (buscarCupo(codigoCurso)){
            cursoBuscado.agregarUnAlumno(alumnoBuscado);
            listaDeInscriptos.add(new Inscripcion(alumnoBuscado, cursoBuscado));
            System.out.println("Inscripcion completada" );
        } else {
            System.out.println("No hay cupo!!");
        }
    }

    private Profesor buscarProfesor(Integer codigoProfesor){
        Profesor profesorBuscado = null;
        for (Profesor unProfesor: listaDeProfesores) {
            if (unProfesor.getCodigoProfesor().equals(codigoProfesor)) {
                profesorBuscado = unProfesor;
            }
        }
        return profesorBuscado;
    }

    public void asignarProfesores(Integer codigoCurso, Integer codigoProfesorTitular, Integer codigoProfesorAdjunto) {
        Curso cursoBuscado = buscarCurso(codigoCurso);
        Profesor profesorTitularBuscado = buscarProfesor(codigoProfesorTitular);
        Profesor profesorAdjuntoBuscado = buscarProfesor(codigoProfesorAdjunto);
        cursoBuscado.setUnProfesorAdjunto(profesorAdjuntoBuscado);
        cursoBuscado.setUnProfesorTitular(profesorTitularBuscado);
            System.out.println("Profesores Asignados!");
    }



    public Alumno buscarAlumno(Integer codigoAlumno){
        Alumno alumnoBuscado = null;
        for (Alumno unAlumno:listaDeAlumnos){
        if (unAlumno.getCodigoAlumno().equals(codigoAlumno)){
            alumnoBuscado = unAlumno;
        }
        }
        return alumnoBuscado;
    }


    public void inscribirAlumnosDesdeArchivo(Integer codigoCurso) {

        String linea = "";
        File alumnosDeArchivo = new File("C:\\Users\\creyescruz\\Desktop\\DH\\DHproyectos\\DHManager\\listadoDeAlumnos.csv");
        FileReader archivoLector;
        String nombres[];

        try {
            archivoLector = new FileReader(alumnosDeArchivo);
            BufferedReader buffer = new BufferedReader(archivoLector);
            while(buffer.ready()) {
                if (!(linea = buffer.readLine()).equals("\000")) {
                    nombres = linea.split(",");
                    codigoAlumno++;
                    altaAlumno(nombres[1],nombres[2],codigoAlumno);
                    inscribirAlumno(codigoAlumno,codigoCurso);

                }
            }

        } catch (Exception e) {

        }
    }
}


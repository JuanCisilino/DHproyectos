package com.company;

import java.util.Date;

public class Inscripcion {

    private Alumno codigoAlumno;
    private Curso codigoDeCurso;
    private Date fechaDeInscripcion = new Date();

    public Inscripcion(Integer codigoAlumno, Integer codigoCurso, Date fechaDeInscripcion) {

        this.fechaDeInscripcion = new Date();
    }


}

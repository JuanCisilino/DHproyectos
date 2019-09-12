package com.company;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Main {

    public static void main(String[] args) {
	// write your code here

        DigitalHouseManagment DHManager = new DigitalHouseManagment();

        DHManager.altaCurso("android", 20001, 2);
        DHManager.altaCurso("full stack", 20002, 3);

        DHManager.altaAlumno("Juan","Cisilino",123);
        DHManager.altaAlumno("Nicolas","Cisili",456);
        DHManager.altaAlumno("Jose","Cisi",789);
        DHManager.altaAlumno("Agustin","Silino",159);
        DHManager.altaAlumno("Ramiro","Cisino",753);
        DHManager.altaAlumno("Pedro","Cilino",123);

        DHManager.altaProfesorAdjunto("Pat","Ugarte", 123,20);
        DHManager.altaProfesorTitular("Nicolas", "Lopez", 456, "Android");

        DHManager.altaProfesorTitular("Jose", "Formosa", 789, "UTN");
        DHManager.altaProfesorAdjunto("Alex", "Dejulio", 753, 20);

        DHManager.inscribirAlumno(123,20001);
        DHManager.inscribirAlumno(456,20001);

        DHManager.inscribirAlumno(789,20002);
        DHManager.inscribirAlumno(159,20002);
        DHManager.inscribirAlumno(753,20002);
        DHManager.inscribirAlumno(123,20002);

        DHManager.asignarProfesores(20001,456,123);
        DHManager.asignarProfesores(20002,789,753);

        DHManager.bajaProfesor(789);

        DHManager.bajaCurso(20001);

        String linea = "";
         File alumnosDeArchivo = new File("C:\\Users\\creyescruz\\Desktop\\DH\\DHproyectos\\DHManager\\listadoDeAlumnos.csv");
        FileReader archivoLector;

        try {
            archivoLector = new FileReader(alumnosDeArchivo);
            BufferedReader buffer = new BufferedReader(archivoLector);
            while(buffer.ready()) {
                if (!(linea = buffer.readLine()).equals("\000")) {
                    System.out.println(linea);
                }
            }

        } catch (Exception e) {

        }

/*      //crear los alumnos

        Alumno juan = new Alumno("Juan","Cisilino",123);
        Alumno gaby = new Alumno("Gabriel","Perez",456);
        Alumno agus = new Alumno("Agustin","Gimenez",789);
        Alumno jose = new Alumno("Jose","Provilo",159);
        Alumno andy = new Alumno("Andres","Nones",753);

        y extiende la clase Alumno a DigitalHouseManagment

* */


    }
}

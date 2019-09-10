package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Curso fullStack = new Curso("Full Stack", 20001, 3);
        Curso android = new Curso("Android", 20002, 2);

        fullStack.altaCurso("Full Stack", 20001, 3);
        android.altaCurso("Android", 20002, 2);


        fullStack.altaProfesorAdjunto("Patricio", "Ugarte", 789, 20);
        fullStack.altaProfesorTitular("Nicolas", "Lopez", 123, "Android");

        android.altaProfesorTitular("Jose", "Formosa", 456, "UTN");
        android.altaProfesorAdjunto("Alex", "Dejulio",753,30);


        fullStack.asignarProfesores(20001,123,789);
        android.asignarProfesores(20002, 456,753);



        android.altaAlumno("Juan","Cisilino",123);
        android.altaAlumno("Gabriel","Perez",456);
        android.altaAlumno("Agustin","Gimenez",789);

        fullStack.altaAlumno("Jose","Provilo",159);
        fullStack.altaAlumno("Andres","Nones",753);

        android.inscribirAlumno(123,20002);
        android.inscribirAlumno(456,20002);
        android.inscribirAlumno(789,20002);

        fullStack.inscribirAlumno(159,20001);
        fullStack.inscribirAlumno(753,20001);

        android.bajaProfesor(123);

        android.bajaCurso(20002);
        


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

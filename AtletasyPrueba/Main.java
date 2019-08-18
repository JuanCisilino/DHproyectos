package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Atleta uno = new Atleta("Juan", 5, 9);
        Prueba primero = new Prueba(uno);

        System.out.println("Veamos si eres digno ");

        primero.puedeRealizar(2,4);

    }
}

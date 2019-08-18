package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Jugador player1 = new Jugador("Juan");
        Entrenamiento Player1Training = new Entrenamiento(player1);

        System.out.println(Player1Training.getExperiencia());

        Player1Training.correr();

        System.out.println(Player1Training.getExperiencia());

        Player1Training.hacerGol();

        System.out.println(Player1Training.getGoles());

        Player1Training.Training();

    }
}

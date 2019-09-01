package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Guerrero olaf = new Guerrero(20);
        Dragon pufpaf = new Dragon(30);
        Mago merlin = new Mago(15);


        olaf.luchar(pufpaf);
        merlin.luchar(pufpaf);

        merlin.resucitarAGuerrero(olaf);

    }
}

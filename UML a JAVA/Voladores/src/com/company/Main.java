package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Pato unPato = new Pato(10);
        Avion unAvion = new Avion(10.0);
        Superman unSuperman = new Superman(5);
        TorreDeControl unaTorreDeControl = new TorreDeControl();


        unaTorreDeControl.agregadoaVolar(unPato);
        unaTorreDeControl.agregadoaVolar(unAvion);
        unaTorreDeControl.agregadoaVolar(unSuperman);

        unaTorreDeControl.vuelanTodos();
    }
}

package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Impresora unaImpresora = new Impresora();
        Foto unaFoto = new Foto();

        unaImpresora.anadiralaCola(unaFoto);
        unaImpresora.imprimir();

    }
}

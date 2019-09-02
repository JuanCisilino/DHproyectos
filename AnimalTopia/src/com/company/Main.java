package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Reptil reptilion = new Reptil("reptilion");
        Mamifero mamu = new Mamifero("Mamu");
        reptilion.setRondaDeMate(reptilion);
        mamu.setRondaDeMate(mamu);

        reptilion.cebar();
        mamu.cebar();
    }
}

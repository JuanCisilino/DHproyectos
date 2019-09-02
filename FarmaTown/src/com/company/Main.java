package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Persona juan = new Persona("Juan", "Papusa");
        Persona nico = new Persona("Nicolas", "Efedrina");
        Medicamento Ibu400 = new Medicamento();
        Medicamento Cafiaspirina = new Medicamento();

        Ibu400.setListaDeMedicamentos("Ibuprofeno");
        Ibu400.setListaDeMedicamentos("Efedrina");

        Cafiaspirina.setListaDeMedicamentos("Cafeina");
        Cafiaspirina.setListaDeMedicamentos("Ibuprofeno");


        Ibu400.vender(juan);
        Cafiaspirina.vender(nico);

        Cafiaspirina.vender(juan);
        Ibu400.vender(nico);

    }

}

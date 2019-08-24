package com.company;

public class Avion implements Volable {

    private Double horasDeVuelo;

    public Avion(Double horasDeVuelo) {
        this.horasDeVuelo = horasDeVuelo;
    }

    @Override
    public void volar() {
        horasDeVuelo = horasDeVuelo + 13;
        System.out.println("Estoy volando como un Avion!!!! Ahora mis horas de vuelo son " + horasDeVuelo);
        }
}

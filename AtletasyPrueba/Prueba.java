package com.company;

public class Prueba {

    private Integer energiaRequerida;
    private Integer dificultadRequerida;
    private Atleta nombre;
    private Integer nivel;
    private Integer energia;

    public Prueba(Atleta nombre) {
    this.nombre = nombre;
    this.nivel = getNivel();
    this.energia = getEnergia();
    }

    public boolean puedeRealizar(Integer energiaRequerida, Integer dificultadRequerida){
        return nivel >= dificultadRequerida && energia >= energiaRequerida ;
    }

    public Integer getNivel() {return nivel;};
    public Integer getEnergia() {return energia;};
}


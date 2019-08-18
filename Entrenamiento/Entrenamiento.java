package com.company;

public class Entrenamiento {
  private Integer experiencia;
    private Integer energia;
    private Integer goles;
    private Integer felicidad;
private Jugador nombre;

public Entrenamiento() {
    this.experiencia = experiencia;
    this.energia = energia;
    this.goles = goles;
    this.felicidad = felicidad;
    }

    public Entrenamiento(Jugador nombre) {
this.nombre = nombre;
energia = 0;
goles = 0;
felicidad = 0;
experiencia = 0;

    }

    public void hacerGol() {
        energia = energia - 5;
        felicidad = felicidad + 10;
        goles = goles + 1;
        experiencia = experiencia + 1;
        System.out.printf("CANTALO CANTALOOOO!!!!!");
    }

    public void correr() {
        experiencia = experiencia + 1;
        energia = energia - 10;
        System.out.printf("No me dan las piernas!!!");
    }

    public void Training() {
       System.out.printf("Tu experiencia inicial es de: " + experiencia);
       correr();
       hacerGol();
       correr();
       System.out.printf("Tu experiencia ahora es de: " + experiencia);

    }
    public Integer getEnergia() {return energia;}
    public Integer getGoles() {return goles;}
    public Integer getFelicidad() {return felicidad;}
    public Integer getExperiencia() {return experiencia;}
}

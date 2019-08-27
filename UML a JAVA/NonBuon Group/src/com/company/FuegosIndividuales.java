package com.company;

public class FuegosIndividuales implements Explotables {
    private String ruido;

    public FuegosIndividuales(){
        this.ruido = ruido;
    }

    @Override
    public void comienzo() {
        ruido = ruido;
    }

    @Override
    public void explotar() {
        System.out.println(ruido);
    }
}

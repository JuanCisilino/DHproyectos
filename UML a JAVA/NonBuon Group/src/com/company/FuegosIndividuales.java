package com.company;

public class FuegosIndividuales implements Explotables {
    public String ruido;

    public FuegosIndividuales(){
        this.ruido = "Pum Pim Pam";
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

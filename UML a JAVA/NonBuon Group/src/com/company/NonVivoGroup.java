package com.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class NonVivoGroup {

    private Set<Invitados> invitados;
    private List<Explotables> explotables;

    public NonVivoGroup() {
        invitados = new HashSet<>();
        explotables = new ArrayList<>();
    }

    public void agregarInvitado(Invitados invitado){
        invitados.add(invitado);

    }

    public void agregarExplotable(Explotables explotable){
        explotables.add(explotable);
    }

    public void explotarFuegos(){
        for (Explotables unExplotable : explotables) {
            unExplotable.explotar();
        }

    }

    public void repartirTorta(){
        for (Invitados unInvitado : invitados) {
            unInvitado.comer();
        }
    }

    public void encenderVelas(){
        repartirTorta();
        explotarFuegos();
    }

}

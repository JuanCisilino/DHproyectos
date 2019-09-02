package com.company;

import java.util.ArrayList;
import java.util.List;

public class Medicamento implements Vendible{

    private List<String> listaDeMedicamentos;

    public Medicamento(){
        this.listaDeMedicamentos = new ArrayList<>();
    }

    public void setListaDeMedicamentos(String droga) {
        listaDeMedicamentos.add(droga);
    }


    @Override
    public void vender(Persona unaPersona) {
        if (listaDeMedicamentos.contains(unaPersona.getAlergia())){
            System.out.println("\n" + unaPersona.getNombre() + " no puede recibir este medicamento");
        } else {
            System.out.println("\n" + unaPersona.getNombre() + " puede pasar por caja a abonar su medicamento!");
        }

    }
}

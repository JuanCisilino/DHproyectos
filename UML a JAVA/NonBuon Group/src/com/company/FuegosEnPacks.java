package com.company;

import java.util.ArrayList;

public class FuegosEnPacks{

    private ArrayList<String> listaDeExplotables = new ArrayList<>();

   public void comienzo(){
       listaDeExplotables.add(0,"pam");
       listaDeExplotables.add(1,"pem");
       listaDeExplotables.add(2,"pim");
       listaDeExplotables.add(3,"pom");
       listaDeExplotables.add(4,"pum");
   }

    public void explotar(){
        for (Integer i = 0 ; i < listaDeExplotables.size() ; i++){
            String unExplotable = listaDeExplotables.get(i);
            System.out.println(listaDeExplotables);;
        }
    }

}

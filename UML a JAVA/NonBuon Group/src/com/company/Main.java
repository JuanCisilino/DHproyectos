package com.company;

public class Main {

     public static void main(String[] args) {
	// write your code here

    FuegosIndividuales unExplotable = new FuegosIndividuales();
    FuegosEnPacks unkitExplotable = new FuegosEnPacks();
    InvitadosST unInvitadoST = new InvitadosST("Nicolas", 55342123);
    InvitadosDH unInvitadoDH = new InvitadosDH("Juan", 30814321);

        unExplotable.comienzo();
        unkitExplotable.comienzo();
        unExplotable.explotar();
        unkitExplotable.explotar();

        unInvitadoDH.comer();


    }
}

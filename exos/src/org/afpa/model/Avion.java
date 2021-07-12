package org.afpa.model;

public class Avion extends Vehicule{

    public Avion(String ma, int pl, int pu) {
        marque = ma;
        pleces = pl;
        puissance = pu;
    }

    public void marche(){

        System.out.printf("C'est un avion de marque %s avec %d place(s) et %d puissannce.", this.marque, this.pleces, this.puissance);
        System.out.println();

    }

}

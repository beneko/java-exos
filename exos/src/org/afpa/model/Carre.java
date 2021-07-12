package org.afpa.model;

public class Carre extends Forme {

    private float cote;

    public Carre(float c){
        cote = c;
    }

    //Aire calcul ici la surface avec le coté c
    public float aire() {

        return (float) Math.pow(cote, 2);

    }
}


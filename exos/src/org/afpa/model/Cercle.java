package org.afpa.model;

public class Cercle extends Forme
{
    private float rayon;

    public Cercle(float r)
    {
        rayon = r;
    }
    public float aire() {
        // ici l’Aire est calculée avec le rayon
        return (float)(Math.PI * Math.pow(rayon, 2));
    }
}

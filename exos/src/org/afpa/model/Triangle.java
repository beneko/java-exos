package org.afpa.model;

public class Triangle extends  Forme{

    private float base;
    private float hauteur;

    public Triangle(float b, float h){
        base = b;
        hauteur = h;
    }

    public float aire(){
        return ((base*hauteur)/2);
    }
}

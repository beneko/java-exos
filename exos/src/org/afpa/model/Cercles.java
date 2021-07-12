package org.afpa.model;

public class Cercles {
    /*
    Cercle
        Dans un fichier nommé Cercles.java, créer la classe de même nom avec 1 variable rayon comme donnée membre.
        Créer 2 fonctions membres calculSurface() et calculCirconference() qui retournent le résultat sous forme de double.
        Créer un second fichier DesCercles.java comme application qui crée 2 objets Cercles de 10 et 45 cm de rayon et qui affiche leur Surface et leur Circonférence.
     */
    public double rayon;

    public Cercles(double rayon){
        this.rayon = rayon;
    }

    public double calculSurface(){

        return Math.pow(this.rayon,2)*Math.PI;
    }
    public double calculCirconference(){

        return (this.rayon*2*Math.PI);

    }
}

package org.afpa.model;

import java.util.Arrays;
import java.util.Scanner;


public class TriNombre {
        /*
        Créer la classe « TriNombre ».
            Cette classe comporte 2 données membres : 1 tableau de types entiers et la taille du tableau.
            Cette classe contient 3 méthodes (fonctions membres) :
            Fonction saisie () qui crée le tableau suivant la taille de ce dernier et qui demande à l’utilisateur de remplir le tableau de nombres.
            Fonction tri() qui trie le tableau.
            Fonction affiche() qui affiche le tableau.
            Créer un second fichier comme application qui crée 2 tableaux de tailles différentes, qui les trie et qui les affiche.
         */
    public int[] tableau;
    public int taille;

    // Fonction saisie () qui crée le tableau suivant la taille de ce dernier et qui demande à l’utilisateur de remplir le tableau de nombres.
    public void saisie(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Veuillez saisir la taille du tableau: ");
        this.taille = scanner.nextInt();

        this.tableau = new int[this.taille];

        for (int i = 0 ; i<this.taille ; i++){

            System.out.println("Entrez la valeur numéro " + (i + 1) + " de tableau: ");
            this.tableau[i]= scanner.nextInt();

        }

    }

    // Fonction tri() qui trie le tableau.
    public void tri(){
        int tmp;
        for (int i = 0; i < this.taille; i++) {
            for (int j = i + 1; j < this.taille; j++) {
                if (this.tableau[i] > this.tableau[j]) {
                    tmp = this.tableau[j];
                    this.tableau[j] = this.tableau[i];
                    this.tableau[i] = tmp;
                }
            }
        }
    }

    // Fonction affiche() qui affiche le tableau.
    public void affiche(){
        System.out.println("Voici le tableau:");
        System.out.println(Arrays.toString(this.tableau));
    }
}

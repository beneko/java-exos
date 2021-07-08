package org.afpa.model;


import java.util.ArrayList;
import java.util.Scanner;

public class Exo20 {
    /*
    Exo16 with class ArrayList

    Ecrivez un programme permettant de créer un tableau, dont la taille est saisie au clavier.

    Ensuite l'utilisateur doit rentrer les différentes valeurs du tableau.

    Puis votre programme doit afficher le contenu du tableau.
     */
    public static void tableau() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrez la taille de tableau:");

        int taille = scanner.nextInt();
        ArrayList<String> arr = new ArrayList<String>();
        for (int i = 0; i < taille; i++) {
            System.out.println("Entrez la valeur numéro " + (i + 1) + " de tableau: ");
            arr.add(scanner.next());
        }
        System.out.println("Voici votre tableau:");
        System.out.println(arr);

    }
}

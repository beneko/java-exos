package exos.java;

import java.util.Scanner;

public class Exos16 {
    /*
    Ecrivez un programme permettant de créer un tableau, dont la taille est saisie au clavier.

    Ensuite l'utilisateur doit rentrer les différentes valeurs du tableau.

    Puis votre programme doit afficher le contenu du tableau.
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrez la taille de tableau:");

        int taille = scanner.nextInt();
        String[] arr = new String[taille];
        for (int i=0; i<taille; i++){
            System.out.println("Entrez la valeur numéro "+ (i+1) + " de tableau: ");
            arr[i] = scanner.next();
        }
        System.out.println("Voici votre tableau:");
        System.out.print("{");
        for (String t : arr ){
            System.out.print(" \"" + t + "\" ");
            System.out.print(", ");
        }
        System.out.print("}");
    }
}

package exos.java;

import java.util.Scanner;

public class Exos14 {
    /*
    dessin d'un triangle
    Écrire un programme qui affiche un triangle isocèle formé d'étoiles. La hauteur du triangle (c'est à dire son nombre de lignes) sera donnée par l'utilisateur. Vous devez obtenir le résultat suivant:

    combien de lignes ?
    5
       *
      ***
     *****
     *******
    *********
     */
    public static void main(String[] args) {

        int ligne;

        Scanner scanner = new Scanner(System.in);

        System.out.println("combien de lignes ?");
        ligne = scanner.nextInt();

        for (int i = 1; i <= ligne; i++) {

            for (int k = 0; k < ligne-i ; k++){

                System.out.print(" ");

            }
            for (int j = 1; j <= i; j++) {

                System.out.print("*");

            }
            for (int f = 2; f <= i; f++) {

                System.out.print("*");

            }
            System.out.println("");
        }
    }
}

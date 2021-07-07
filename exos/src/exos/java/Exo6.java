package exos.java;

import java.util.Scanner;

public class Exo6 {
    /*
     ASCII
    Écrire un programme qui saisit un code Unicode en décimal et affiche le caractère correspondant.
    Exemple: la saisie de l’entier 65 donne le caractère « A ».
     */
    public static void main(String[] args) {

        int asci;
        char chr;

        System.out.println("Please enter a number:");
        Scanner scanner = new Scanner(System.in);
        asci = scanner.nextInt();
        chr = (char) asci;

        System.out.println("it represent \'"+ chr + "\' character.");
    }
}

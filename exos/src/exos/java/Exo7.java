package exos.java;

import java.util.Scanner;

public class Exo7 {

    /*
    Parité

    Écrivez un programme qui demande un nombre à l’utilisateur puis qui test si ce nombre est pair.

    Le programme doit afficher le résultat « nombre pair » ou « nombre impair ».

    Vous devez utiliser l’opérateur modulo « % » qui donne le reste d’une division.

    a%2 donne le reste de la division de a par 2, si ce reste est égale à zéro, a est divisible par 2.
     */
    public static void main(String[] args) {

        int number;
        String result;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vuillez entrez un nombre:");
        number = scanner.nextInt();

        if(number % 2 == 0 ){
            result = "nombre pair";
        }else {
            result = "nombre impair";
        }

        System.out.println("le nombre est: " + result);

    }
}

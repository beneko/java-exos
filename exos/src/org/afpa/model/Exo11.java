package org.afpa.model;

import java.util.Scanner;

public class Exo11 {
    /**
    La somme des entiers inférieurs à N
    Écrivez un programme qui affiche la somme des nombres inférieurs à N.
     */
    public static void somme() {

        int number;
        int sum = 0;
        int i;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter an integer number:");
        number = scanner.nextInt();

        for ( i = 1 ; i < number; i++) {

            sum += i;

        }
        System.out.println("the sum of numbers less than this number is:" + sum);
    }
}

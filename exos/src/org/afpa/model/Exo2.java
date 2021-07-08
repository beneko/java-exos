package org.afpa.model;

import java.util.Scanner;

public class Exo2 {
    /*
    Diviseur
    Modifier le programme précédent pour effectuer une division.
     */
    public static void diviseur() {
        System.out.println("Please input a number:");
        Scanner sc = new Scanner(System.in);
        float num1 = sc.nextInt();
        System.out.println("Please input another number:");
        float num2 = sc.nextInt();
        System.out.println(num1 / num2);

    }
}

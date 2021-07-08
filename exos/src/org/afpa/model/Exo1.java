package org.afpa.model;

import java.util.Scanner;

public class Exo1 {
    /*
     Additionneur
     Écrivez un programme qui demande deux nombres à l’utilisateur et qui affiche la somme de ces deux nombres.
     */
    public static void additionneur() {
        System.out.println("Please input a number:");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        System.out.println("Please input another number:");
        int num2 = sc.nextInt();
        System.out.println(num1 +num2);
    }

}

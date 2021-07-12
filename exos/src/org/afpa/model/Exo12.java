package org.afpa.model;

import java.util.Scanner;

public class Exo12 {
    /**
    Somme d'un intervalle
    Écrivez un programme qui saisit deux nombres n1 et n2 et qui calcul ensuite la somme des entiers de n1 à n2.
     */
    public static void somme() {

        int num1, num2;
        int sum = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the first number:");
        num1 = scanner.nextInt();

        System.out.println("Please enter the second number:");
        num2 = scanner.nextInt();


        for (int i= ++num1 ; i < num2 ; i++) {

            sum += i;

        }

        System.out.println("The sum of the integers form "+num1 +" to "+ num2 +" is equal to:" + sum);

    }
}

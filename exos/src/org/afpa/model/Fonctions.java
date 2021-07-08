package org.afpa.model;

import java.util.Scanner;

public class Fonctions {

    /*
    Reprendre le programme de calculette présenté dans le chapitre précédent, et le modifier pour intégrer des fonctions correspondant aux opérations effectuées.
     */
    public static double calcul(char operator, double num1, double num2) {

        double result = 0;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;

            case '-':
                result = num1 - num2;
                break;

            case '*':
                result = num1 * num2;
                break;

            case '/':
                if (num2 == 0) {

                } else {
                    result = num1 / num2;
                }
                break;

            default:
                System.out.println("Error");

        }

        return result;
    }
    /*
    Chaine de caratères
    Ecrire une fonction de concaténation de chaînes.

    Cette fonction se nommera concat, elle doit prendre deux paramètres chaine1 et chaine2 de type String.

    Elle doit retourner le résultat de la concaténation de chaine1 et chaine2.
     */
    public static String concat(String chaine1, String chaine2) {

        String result = chaine1 + chaine2;
        return result;
    }

}

package org.afpa.model;

import java.util.ArrayList;
import java.util.Scanner;

public class Fonctions {

    /*
        Reprendre le programme de calculette présenté dans le chapitre précédent,
        et le modifier pour intégrer des fonctions correspondant aux opérations effectuées.
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

    /*
    Chaine de caratères
        Écrire une fonction qui affiche le nombre de mots d’une phrase

        Cette fonction se nommera compteMot. Elle prendra en paramètre une chaîne de caractères.

        Elle retourne le nombre de mots présents dans la phrase.
        Pour compter le nombre de mots, vous pouvez compter le nombre d'espace présents dans la phrase
     */
    public static int compteMot(String phrase) {

        int space = 0;

        while (phrase.charAt(0) == ' '){ // remove spaces in beginning of the sentence

            phrase = phrase.substring(1, (phrase.length()-1));

        }

        while (phrase.charAt((phrase.length()-1)) == ' '){ // remove spaces in the end of the sentence

            phrase = phrase.substring(0, (phrase.length() - 1));

        }


        for (int i=0 ; i<phrase.length() ;i++){
            char chr = phrase.charAt(i);
            if(chr == ' ' && phrase.charAt(i-1) != ' '){// count single spaces
                space++;
            }
        }
        return space+1;
    }
}

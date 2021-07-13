package org.afpa.model;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Fonctions {

    /**
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
    /**
    Chaine de caratères
        Ecrire une fonction de concaténation de chaînes.
        Cette fonction se nommera concat, elle doit prendre deux paramètres chaine1 et chaine2 de type String.
        Elle doit retourner le résultat de la concaténation de chaine1 et chaine2.
     */
    public static String concat(String chaine1, String chaine2) {

        String result = chaine1 + chaine2;
        return result;
    }

    /**
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
    /**
    Fibonacci
        Écrire un programme qui affiche les premiers termes de la suite de Fibonacci.

     */
    public static int[] fibonacci(int n){

        int[] f = new int[n];

        f[0] =0 ;
        f[1] =1 ;

        for(int i=2; i<n; i++){
            f[i] = f[i-1] + f[i-2];
        }
    return f;
    }

    /**
    Table de multiplication
        Ecrivez une fonction qui affiche une table de multiplication. Votre fonction doit prendre un paramètre qui permet d’indiquer quelle table afficher.
     */
    public static void tableMultiplication(int num){

        for (int i=1 ; i<=10 ; i++){

            System.out.println(i + " x " + num + " = "+ (i*num));

        }
    }

    /**
    Compter le nombre de lettres
        Ecrivez une fonction qui prend deux paramètres :
        phrase de type string et lettre de type string
        La fonction compte le nombre de fois ou lettre apparait dans phrase
     */
    public static int compteLettre(String str, String lettre){

        int nombre = 0 ;
        char ltr = lettre.charAt(0);

        for (int i=0 ; i<str.length(); i++){

            char chr = str.charAt(i);
            if(chr == ltr){
                nombre++;
            }
        }
        return nombre;
    }

    /**
    String Token
        Concevez la function strtok qui prend trois paramètres en entrée et renvoie une chaîne de caractères.
        On suppose que str1 est composée d’une liste de mots séparés par le caractère str2.
        strtok sert à extraire le nième mot de str1.
     */
    public static String strtok (String str1, String str2, int n){

        String[] str = str1.split(str2);
        return str[n-1];
    }
}

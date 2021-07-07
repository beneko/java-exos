package org.afpa.exos;


import java.util.Scanner;

public class Exo15 {
    /*
    Un palindrome est un mot que l'on peut lire dans les deux sens.
    La distinction entre majuscules/minuscules n'a aucune importance pour la lecture d'un palindrome.
     Si on ne tient pas compte des espaces, des virgules, des tirets et des apostrophes (i.e. les caractères ' ', ',', '-' et '\''),
      une phrase complète peut aussi être considérée comme un palindrome.
      Exemples de palindromes: Otto Elu par cette crapule Esope reste ici et se repose Tu l'as trop ecrase,
       Cesar, ce Port-Salut A man, a plan, a canal, Panama Exemples de non-palindromes:
        Cours de Java Le pont de la rivière Kwai Ecrivez un programme Palindrome.
        java qui lit une chaine de caractères du clavier et qui teste s'il s'agit d'un palindrome.
         Exemple d'exécution: Entrez un mot ou une phrase : Otto C'est un palindrome ! Pour ce programme,
         il convient d'utiliser plusieurs méthodes prédéfinies de la classe String, comme par exemple charAt(),
          toLowerCase() et length(). chaine.toLowerCase() permet de convertir tous les caratères de chaine en minuscule.
     */
    public static void main(String[] args) {

        String words;
        String wordsNew;
        String inverse = "";
        int length;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez un mot ou une phrase :");
        words = scanner.nextLine();
        length = words.length();
        wordsNew = words;

        for (int i = 0; i < length; i++) {
            char chr = words.charAt(i);
            switch (chr) {
               case ' ':
                   wordsNew = wordsNew.replace(" ", "");
                case ',':
                    wordsNew = wordsNew.replace(",", "");
                case '-':
                    wordsNew = wordsNew.replace("-", "");
                case '\'':
                    wordsNew = wordsNew.replace("\'", "");
            }
        }
        wordsNew = wordsNew.toLowerCase();

        for (int j= wordsNew.length()-1; j>=0; j--){
            inverse += wordsNew.charAt(j);
        }

//        System.out.println(wordsNew);
//        System.out.println(inverse);

        if (wordsNew.equals(inverse)){

            System.out.println("C'est un palindrome!");

        } else {

            System.out.println("Ce n'est pas un palindrome!");

        }
    }

}

package exos.java;

import java.util.Scanner;

public class Exo13 {
    /*
    Nombre de voyelles.
        Écrire le programme qui compte le nombre de voyelles d’un mot saisi au clavier, en utilisant :

        length() qui rend le nombre de lettres d’une chaîne donnée ([documentation](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html#length())).

        substring(p,n) qui extrait d’une chaîne donnée une sous chaîne de n caractères à partir de la position p (documentation).

        .charAt() qui extrait le caractère à l'indice demandé (documentation)

        IndexOf(chaîne) qui restitue le rang de la première occurrence de schaîne dans chaîne donnée (si non trouvé : -1) (documentation).
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a word:");

        String word = scanner.next();
        int length = word.length();
        int vowels = 0 ;
        for (int i=0 ; i < length ; i++){

            char chr = word.charAt(i);
            switch (chr) {
                case 'a', 'o', 'e', 'i', 'u' , 'y' , 'A', 'O', 'E', 'I', 'U' , 'Y' -> vowels++;
            }
        }
        System.out.println("the number of vowels in "+ word + " is: " + vowels);
    }
}

package exos.java;

import java.util.Arrays;
import java.util.Scanner;

public class Exo17 {
    /*
    On recherche dans un tableau contenant 20 prénoms, un prénom saisi au clavier.
    Lorsque cet élément est trouvé, on l’élimine du tableau en décalant les cases qui le suivent, et en mettant à blanc la dernière case
     */
    public static void main(String[] args) {

        boolean find = false;

        String[] prenoms = {"Camille", "Anais", "Axel", "Arthur", "Evan",
                            "Clara", "Emma", "Charlotte", "Adrien", "Celia",
                            "Eva", "Alexis", "Antoine", "Adam", "Alexandre",
                            "Ambre", "Baptiste", "Clemence", "Enzo", "Juliette"};

        System.out.println("Voici notre tableau:");
        System.out.println(Arrays.toString(prenoms));
        System.out.println("Choisissez un prénom pour l’éliminer du tableau:");
        Scanner scanner = new Scanner(System.in);
        String choix = scanner.next();

        for (int i=0; i< prenoms.length; i++) {

            if (choix.equals(prenoms[i])){

                find = true;
                prenoms[i] = "";

                for (int j=i ; j< prenoms.length-1; j++){

                    prenoms[j] = prenoms[j+1];

                }
                prenoms[prenoms.length-1] = "   ";
                break;
            }
        }
        if(find){

            System.out.println("Voici le nouveau tableau:");
            System.out.print(Arrays.toString(prenoms));

        }else {

            System.out.println("Le prénom n'est pas trouvé !!!");

        }

    }
}

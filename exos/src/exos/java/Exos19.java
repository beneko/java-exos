package exos.java;

import java.util.ArrayList;
import java.util.Scanner;

public class Exos19 {
    /*
    Exo17 with class ArrayList
     */
    public static void main(String[] args) {
        boolean find = false;

        ArrayList<String> prenoms = new ArrayList<String>();
        prenoms.add("Camille");
        prenoms.add("Anais");
        prenoms.add("Axel");
        prenoms.add("Arthur");
        prenoms.add("Evan");
        prenoms.add("Clara");
        prenoms.add("Emma");
        prenoms.add("Charlotte");
        prenoms.add("Adrien");
        prenoms.add("Celia");
        prenoms.add("Eva");
        prenoms.add("Adam");
        prenoms.add("Alexandre");
        prenoms.add("Ambre");
        prenoms.add("Baptiste");
        prenoms.add("Clemence");
        prenoms.add("Enzo");
        prenoms.add("Juliette");
        prenoms.add("Juliette");
        prenoms.add("Juliette");
        prenoms.add("Alexis");
        prenoms.add("Antoine");

        System.out.println("Voici notre tableau:");
        System.out.println(prenoms);
        System.out.println("Choisissez un prénom pour l’éliminer du tableau:");
        Scanner scanner = new Scanner(System.in);
        String choix = scanner.next();

        for (int i=0; i< prenoms.size(); i++) {

            if (choix.equals(prenoms.get(i))){

                find = true;
                for (int j=i ; j< prenoms.size()-1; j++){

                    prenoms.set(j, prenoms.get(j + 1));

                }
                prenoms.set(prenoms.size() - 1, "   ");
                break;
            }
        }
        if(find){

            System.out.println("Voici le nouveau tableau:");
            System.out.print(prenoms);

        }else {

            System.out.println("Le prénom n'est pas trouvé !!!");

        }
    }
}

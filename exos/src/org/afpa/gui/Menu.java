package org.afpa.gui;

import org.afpa.model.*;

import java.util.Scanner;

public class Menu {

    private boolean again= false;

    public void init(){

        System.out.println("==================================================");
        System.out.println("|                    Welcome                     |");
        System.out.println("==================================================");
        do {
            System.out.println("Entrez le numéro d'éxercice que vous voulez éxecuter?(entre 1-23)");
            Scanner scanner= new Scanner(System.in);
            int n = scanner.nextInt();
            switch (n){

                case 1 -> Exo1.additionneur();
                case 2 -> Exo2.diviseur();
                case 3 -> Exo3.conversion();
                case 4 -> Exo4.moyenne();
                case 5 -> Exo5.conversion();
                case 6 -> Exo6.ascii();
                case 7 -> Exo7.pair();
                case 8 -> Exo8.age();
                case 9 -> Exo9.calculette();
                case 10 -> Exo10.inferieurs();
                case 11 -> Exo11.somme();
                case 12 -> Exo12.somme();
                case 13 -> Exo13.voyelles();
                case 14 -> Exo14.triangle();
                case 15 -> Exo15.palindrome();
                case 16 -> Exo16.tableau();
                case 17 -> Exo17.prenom();
                case 18 -> Exo18.trier();
                case 19 -> Exo19.prenom();
                case 20 -> Exo20.tableau();
                case 21 -> {

                    double num1, num2;
                    char operator;
                    double result;

                    System.out.println("Please enter the first number:");
                    num1 = scanner.nextFloat();
                    System.out.println("Please enter an operator:");
                    operator = scanner.next().charAt(0);
                    System.out.println("Please enter the second number:");
                    num2 = scanner.nextFloat();
                    result = Fonctions.calcul(operator,num1,num2);
                    System.out.println("the result is equal to:" + result);

                }
                case 22 -> {
                    String str1,str2;
                    System.out.println("Please enter a string:");
                    scanner.nextLine();
                    str1 = scanner.next();
                    System.out.println("Please enter another string:");
                    scanner.nextLine();
                    str2 = scanner.next();
                    String result = Fonctions.concat(str1,str2);
                    System.out.println(result);
                }
                case 23 ->{
                    System.out.println("Please enter a sentence:");
                    scanner.nextLine();
                    String str = scanner.nextLine();
                    int result = Fonctions.compteMot(str);
                    System.out.printf("Il y a %d mot dans la phrase", result);
                    System.out.println("");
                }
                default -> System.out.println("l'exercice n'est pas trouvé!");
            }

            System.out.println("Voulez vous continuer? y/n");
            char reponse = scanner.next().charAt(0);
            switch (reponse){
                case 'y' -> again = true;
                case 'n' -> again = false;
                default -> System.out.println("votre choix n'est pas reconnu, ce sera non !!!");
            }

        }while(again);

        System.out.println("==================================================");
        System.out.println("|                   Goodbye!                     |");
        System.out.println("==================================================");

    }
}
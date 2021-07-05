package exos.java;

// Il s’agit de calculer une moyenne sur la base de trois notes sachant que :


import java.util.Scanner;

public class Exo4 {

    public static void main(String[] args) {

        float note1;   // une note de travaux pratique a un coefficient de 1
        float note2;  // une note d’interrogation écrite a un coefficient de 2
        float note3; // une note de devoir surveillé a un coefficient de 3
        float moyenne ;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrez une note de travaux pratique  qui a un coefficient de 1:");
        note1 = scanner.nextFloat();

        System.out.println("Entrez une note d’interrogation écrite qui a un coefficient de 2:");
        note2 = scanner.nextFloat();

        System.out.println("Entrez une note de devoir surveillé qui a un coefficient de 3:");
        note3 = scanner.nextFloat();

        moyenne = ((note1)+(note2*2)+(note3*3))/6;
        System.out.println("La moyenne sur la base de trois notes est égal à : " + moyenne);
    }
}

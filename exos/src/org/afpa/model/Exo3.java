package org.afpa.model;

import java.util.Scanner;

public class Exo3 {
    /**
    Conversion de température
    En utilisant la formule C = (5/9)(F-32) écrire un programme qui lit une température exprimée en degrés Fahrenheit et affiche sa valeur en degrés Celsius.
     */
    public static void conversion() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a temperature in Fahrenheit:");
        float f = scanner.nextFloat();
        float c = ((5f / 9f) * (f - 32));
        System.out.println("it's equal to " + c + " Celsius degrees");

    }
}

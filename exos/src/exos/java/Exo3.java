package exos.java;

import java.util.Scanner;

public class Exo3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a temperature in Fahrenheit:");
        float f = scanner.nextFloat();
        float c = ((5f / 9f) * (f - 32));
        System.out.println("it's equal to " + c + " Celsius degrees");

    }
}

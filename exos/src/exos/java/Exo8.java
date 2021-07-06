package exos.java;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.TimeZone;

public class Exo8 {
    /*Age
    Écrivez un programme qui demande l’année de naissance à l’utilisateur.
    En réponse votre programme doit afficher l’âge de l’utilisateur et indiquer si l’utilisateur est majeur ou mineur.
     */
    public static void main(String[] args) {

        int year;
        int age;
        int currentYear;

        Scanner scanner = new Scanner(System.in);
        Date date = new Date();
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("Europe/Paris"));
        cal.setTime(date);
        currentYear = cal.get(Calendar.YEAR);

        System.out.println("Please insert your birth year:");
        year = scanner.nextInt();
        age = currentYear - year;

        if (age < 18){

            System.out.println("you are a minor.");

        } else {

            System.out.println("you are a major.");

        }

        System.out.println("And you're "+age + " years old.");

    }
}

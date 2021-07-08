package org.afpa.model;

import java.util.Scanner;

public class Exo5 {
    /*   Conversion d'un nombre de secondes en HH:MM:SS
        II s'agit pour un nombre de secondes entré au clavier d'en déduire, son expression en nombre d'heures de minutes et de secondes.
     */
    public static void conversion() {

        int second, hh, mm, ss;

        System.out.println("Please enter a number for number of seconds:");
        Scanner scanner = new Scanner(System.in);
        second = scanner.nextInt();

        hh = second / 3600;
        mm = (second % 3600)/60;
        ss = ((second % 3600)%60);

        System.out.println("lt's equal to: " + hh +":" + mm + ":" + ss + " in HH:MM:SS");
    }
}

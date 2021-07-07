package exos.java;

import java.util.Arrays;

public class Exo18 {
    /*
    Ecrire un programme qui permet de trier un tableau en utilisant le tri à bulles.
    Plus d'information sur le tri à bulle: Wikipedia ou le tri à bulle en musique
     */
    public static void main(String[] args) {

        int[] arr = {12, 45, 45, 21, 1, 6, 85, 2, 35, 89, 47, 6, 8};
        int tmp;

        System.out.println("Voici notre tableau:");
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    tmp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = tmp;
                }
            }
        }
        System.out.println("Voici le tableau trié:");
        System.out.println(Arrays.toString(arr));
    }
}

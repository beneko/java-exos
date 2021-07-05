package exos.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Please input a number:");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        System.out.println("Please input another number:");
        int num2 = sc.nextInt();
        System.out.println(num1 + num2);

    }
}
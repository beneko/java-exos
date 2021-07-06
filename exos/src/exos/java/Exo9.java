package exos.java;

import java.util.Scanner;

public class Exo9 {
    /*
    Calculette
        Faire la saisie de 2 nombres entiers, puis la saisie d'un opérateur '+', '-', '*' ou '/'.
        Si l'utilisateur entre un opérateur erroné, le programme affichera un message d'erreur.
        Dans le cas contraire, le programme effectuera l'opération demandée (en prévoyant le cas d'erreur "division par 0"), puis affichera le résultat.
     */
    public static void main(String[] args) {

        float num1, num2;
        char operator;
        float result;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the first number:");
        num1 = scanner.nextFloat();
        System.out.println("Please enter an operator:");
        operator = scanner.next().charAt(0);

        while (!(operator == '+' || operator == '-' || operator == '*' || operator == '/')) {

            System.out.println("Operator in not valid!");
            System.out.println("Please enter another operator:");
            operator = scanner.next().charAt(0);

        }
        System.out.println("Please enter the second number:");
        num2 = scanner.nextFloat();

        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("the result is equal to:" + result);
                break;

            case '-':
                result = num1 - num2;
                System.out.println("the result is equal to:" + result);
                break;

            case '*':
                result = num1 * num2;
                System.out.println("the result is equal to:" + result);
                break;

            case '/':
                if (num2 == 0) {
                    System.out.println("Division to zero is not possible");
                } else {
                    result = num1 / num2;
                    System.out.println("the result is equal to:" + result);
                }
                break;

            default:
                System.out.println("Error");

        }
    }
}

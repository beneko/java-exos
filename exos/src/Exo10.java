import java.util.Scanner;

public class Exo10 {
    /*
    Les entiers inférieurs à N
    Écrivez un programme qui affiche les nombres inférieurs à N.
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number:");
        int number = scanner.nextInt();

        System.out.println("numbers less than this number are:");
        for (int i=0; i<number ; i++){

            System.out.println(i);

        }
    }
}

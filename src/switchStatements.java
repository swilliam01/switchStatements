import java.util.Scanner;

public class switchStatements {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int secretNumber, guess = 0;

        //guess is initialized to 0

        secretNumber = 5;

        System.out.println("I'm thinking of a number between 1 and 1000");
        System.out.print("Enter the number:");
        guess = keyboard.nextInt();

        while (guess == secretNumber) {
            System.out.println("You are correct. You win a prize!");
            System.out.println("Enter the number: ");
            guess = keyboard.nextInt();
        }
    }
}



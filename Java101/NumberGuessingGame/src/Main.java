import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Random random = new Random();
        Scanner scan = new Scanner(System.in);

        final int upperBound = 100;
        int numberToGuess = random.nextInt(upperBound);
        
        int remainingNumberOfGuesses = 5;
        int remainingInvalidAccess = 3;
        int guess;

        System.out.println("*********************************************");
        System.out.println("Welcome to NGG(Number Guessing Game)");
        System.out.println("You have " + remainingNumberOfGuesses + " rights for guessing.");
        System.out.println("You have " + remainingInvalidAccess + " rights for entering invalid value.");
        System.out.println("*********************************************");

        do {
            System.out.println("-------------------------------");
            System.out.print("Your guess(between 0 and 100): ");
            guess = scan.nextInt();
            if (guess < 0 || guess > 99) {
                remainingInvalidAccess--;
                System.out.println("Invalid input! Remaining number of rights: " + remainingInvalidAccess);
            } else {
                if (guess == numberToGuess) {
                    System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                    System.out.println("Congratulations! You have correctly guessed the number " + numberToGuess);
                    System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                    break;
                } else {
                    remainingNumberOfGuesses--;
                    System.out.println("Wrong guess! Remaining number of rights: " + remainingNumberOfGuesses);
                    if (remainingNumberOfGuesses != 0) {
                        if (guess < numberToGuess) {
                            System.out.println("Please guess higher.");
                        } else {
                            System.out.println("Please guess lower.");
                        }
                    }
                }
            }
        } while (remainingNumberOfGuesses > 0 && remainingInvalidAccess > 0);

        System.out.println();
        if (remainingInvalidAccess == 0) {
            System.out.println("Game over!");
            System.out.println("Your number of rights to enter invalid value is over!");
        }
        if (remainingNumberOfGuesses == 0) {
            System.out.println("Game over!");
            System.out.println("Your number of rights to guess is over!");
        }

    }

}

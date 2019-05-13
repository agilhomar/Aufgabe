

import java.util.Random;
import java.util.Scanner;

public class GuessingNumbers {


    public static void main(String[] args) {

        int numberOfTrys = 5;
        int guessedNumber = -1;
        final int maxNumber = 9;
        final int randomNumber = new Random().nextInt(maxNumber + 1);

        Scanner input = new Scanner(System.in);
        System.out.println(randomNumber);

        while (guessedNumber != randomNumber) {

            System.out.println("Try to guess a random number between 0 and " + maxNumber);
            System.out.println("You have " + numberOfTrys + " attempts left");

            System.out.println("Your guess: ");
            guessedNumber = input.nextInt();

            if (guessedNumber == randomNumber) {

                System.out.println("Congratulation! Thats the right number!");
                break;
            }

            if (guessedNumber < 0 || guessedNumber > 9) {

                System.out.println("Invalid Number \n");
            }

            System.out.println("Sorry that's the wrong number.\n---------------------------------------------");

            numberOfTrys--;

            if (numberOfTrys == 0) {

                System.out.println("Game Over");
                break;
            }
        }

    }
}



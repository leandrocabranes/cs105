package week5;

import java.util.Scanner;
import java.lang.Math;

public class GuessingGame {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        String input = "";
        Boolean keepPlaying = false;
        Boolean validKeepPlayingInput = false;
        Boolean validGuess = false;
        Boolean success = false;
        Integer guess = 0;
        Integer guessAttempts = 0;

        Integer randNum = 0;

        do {
            randNum = (int)(Math.random() * 100) + 1;
            validGuess = false;
            success = false;
            System.out.println("This program is a guessing game.\nThe computer will generate a random integer between 1 and 100. The user will try to guess the number.\nLet's get started!\n\nI'm thinking of a number between 1 and 100.\n");
            do { 
                do {
                    System.out.println("Please enter your guess:");
                    input = in.nextLine();
                    try {
                        guess = Integer.parseInt(input);
                        validGuess = true;
                        if (guess == randNum) {
                            System.out.println("CORRECT! You guessed it in "+ guessAttempts +" tries!!\n");
                            success = true;
                        } else if (guess <= 0 || guess > 100) {
                            System.out.println("Please enter a value greater than 0 and less than 101.\n");
                            guess = 0;
                        } else if (guess > randNum) {
                            System.out.println("Your guess is too high. Try again.\n");
                            guessAttempts++;
                            guess = 0;
                        } else if (guess < randNum) {
                            System.out.println("Your guess is too low. Try again.\n");
                            guessAttempts++;
                            guess = 0;
                        }
                    } catch (Exception e) {
                        System.out.println("Error: Please enter a whole number.\n");
                        validGuess = false;
                    }
                } while (!validGuess);
                
            } while (!success);

            do {
                System.out.println("Would you like to play again? (Y/N):");
                input = in.nextLine();
                
                if (input.equalsIgnoreCase("Y")) {
                    keepPlaying = true;
                    validKeepPlayingInput = true;
                } else if (input.equalsIgnoreCase("N")) {
                    keepPlaying = false;
                    validKeepPlayingInput = true;

                } else {
                    System.out.print("Invalid Response! Please answer with a 'Y' or 'N'.\n\n");
                    validKeepPlayingInput = false;
                }
            } while (!validKeepPlayingInput);
        } while (keepPlaying);

        in.close();
    }
}

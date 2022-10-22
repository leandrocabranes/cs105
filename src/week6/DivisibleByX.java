package week6;

import java.util.Scanner;

public class DivisibleByX {
    public static void main(String[] args) throws Exception {
        System.out.println(
                "In this program, we will display a series of numbers divisible by an integer specified by the user.\nYou will ask the user for the starting number, the ending number, and the integer to be considered.\n");
        Scanner in = new Scanner(System.in);
        String input = "";
        Integer firstNumber = 0;
        Integer secondNumber = 0;
        Integer thirdNumber = 0;
        Boolean firstInputFail = true;
        Boolean secondInputFail = true;
        Boolean thirdInputFail = true;

        Boolean keepPlaying = true;
        Boolean keepPlayingInputFail = true;

        do {

            do {
                try {
                    System.out.println("Please enter the starting number: ");
                    input = in.nextLine();
                    firstNumber = Integer.parseInt(input);
                    firstInputFail = false;
                } catch (Exception e) {
                    System.out.println("Invalid Response! Please enter a whole number.\n");
                }
            } while (firstInputFail);

            do {
                try {
                    System.out.println("Please enter the ending number: ");
                    input = in.nextLine();
                    secondNumber = Integer.parseInt(input);
                    secondInputFail = false;
                } catch (Exception e) {
                    System.out.println("Invalid Response! Please enter a whole number.\n");
                }
            } while (secondInputFail);

            do {
                try {
                    System.out.println("Please enter the test number: ");
                    input = in.nextLine();
                    thirdNumber = Integer.parseInt(input);
                    thirdInputFail = false;
                } catch (Exception e) {
                    System.out.println("Invalid Response! Please enter a whole number.\n");
                }
            } while (thirdInputFail);

            System.out.println("Here are the numbers between " + firstNumber + " and " + secondNumber
                    + " that are divisible by " + thirdNumber + ":");

            for (Integer i = firstNumber; i <= secondNumber; i++) {
                if (i % thirdNumber == 0) {
                    System.out.println(i);
                }
            }

            do {
                System.out.println("Would you like to play again? (Y/N):");
                input = in.nextLine();
                
                if (input.equalsIgnoreCase("Y")) {
                    keepPlaying = true;
                    keepPlayingInputFail = false;
                } else if (input.equalsIgnoreCase("N")) {
                    keepPlaying = false;
                    keepPlayingInputFail = false;

                } else {
                    System.out.print("Invalid Response! Please answer with a 'Y' or 'N'.\n\n");
                    keepPlayingInputFail = true;
                }

            } while (keepPlayingInputFail);

        } while (keepPlaying);
        in.close();
    }
}

package week7;

import java.util.Scanner;

public class IsBetween {
    public static void main(String[] args) {
        System.out.println(
                "This program will ask the user for three numbers and determine if the second number lies between the first and the third.\n");
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
                    System.out.println("Please enter the low number: ");
                    input = in.nextLine();
                    firstNumber = Integer.parseInt(input);
                    firstInputFail = false;
                } catch (Exception e) {
                    System.out.println("Invalid Response! Please enter a whole number.\n");
                    firstInputFail = true;
                }
            } while (firstInputFail);

            do {
                try {
                    System.out.println("Please enter the number to be tested (the between number): ");
                    input = in.nextLine();
                    secondNumber = Integer.parseInt(input);
                    secondInputFail = false;
                } catch (Exception e) {
                    System.out.println("Invalid Response! Please enter a whole number.\n");
                    secondInputFail = true;
                }
            } while (secondInputFail);

            do {
                try {
                    System.out.println("Please enter the high number: ");
                    input = in.nextLine();
                    thirdNumber = Integer.parseInt(input);
                    thirdInputFail = false;
                } catch (Exception e) {
                    System.out.println("Invalid Response! Please enter a whole number.\n");
                    thirdInputFail = true;
                }
            } while (thirdInputFail);

            if (isBetweeen(firstNumber, secondNumber, thirdNumber)) {
                System.out.println(secondNumber + " lies between the numbers " + firstNumber + " and " + thirdNumber + ".");
            } else {
                System.out.println(secondNumber + " DOES NOT lie between the numbers " + firstNumber + "and " + thirdNumber + ".");
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

    public static Boolean isBetweeen(Integer lowNumber, Integer testNumber, Integer highNumber) {
        if (lowNumber < testNumber && testNumber < highNumber) {
            return true;
        }

        return false;
    }
}

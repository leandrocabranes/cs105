package week7;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String playAgain = "Y";
        String input = "";
        Integer numbersToEvaluate = 3;
        Integer[] inputNumbers = new Integer[numbersToEvaluate];
        Boolean inputFail = true;

        while (playAgain.equalsIgnoreCase("Y")) {
            for (int i = 0; i < numbersToEvaluate; i++) {
                Integer displayNumber = i + 1;
                while(inputFail) {
                    try {
                        System.out.println("Please enter the #" + displayNumber + " number:");
                        input = in.nextLine();
                        Integer tempInteger = Integer.parseInt(input);
                        inputFail = false;
                        inputNumbers[i] = tempInteger;
                    } catch (Exception e) {
                        System.out.println("Invalid Response! Please enter a whole number.\n");
                    }
                }
            }
            Integer maxNumber = largestNumber(inputNumbers);
            System.out.println("The largest of the three numbers is: " + maxNumber);

            do {
                System.out.println("Would you like to play again? (Y/N):");
                playAgain = in.nextLine();

                if (!playAgain.equalsIgnoreCase("Y") && !playAgain.equalsIgnoreCase("N")) {
                    System.out.print("Invalid Response! Please answer with a 'Y' or 'N'.\n\n");
                }

            } while (!playAgain.equalsIgnoreCase("Y") && !playAgain.equalsIgnoreCase("N"));
        }

        in.close();
    }

    public static Integer largestNumber(Integer[] numbersArray) {
        Integer largestNumber = 0;
        for (int i = 0; i < numbersArray.length; i++) {
            if (numbersArray[i] > largestNumber) {
                largestNumber = numbersArray[i];
            }
        }

        return largestNumber;
    }
}

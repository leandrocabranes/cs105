package week7;

import java.util.Scanner;

public class GetValidX {
    public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		// Play the game until the user says they don't want to play again.
		String playAgain = "Y";

		while (playAgain.equalsIgnoreCase("Y")) {
			// Get an integer from the user
			int intNum = getValidInt(in, "Please enter a whole number: ",
					"Invalid Response! Please enter a whole number.");
			System.out.printf("The whole number your entered was: %d.%n", intNum);
			System.out.println("Now we will test your whole number in a math equation...");
			System.out.printf("Adding 10 to your whole number would be: 10 + %d = %d.%n", intNum, intNum + 10);
			System.out.println();

			// Get a floating-point from the user
			double doubleNum = getValidDouble(in, "Please enter a decimal-point number: ",
					"Invalid Response! Please enter a number.");
			System.out.printf("The float your entered was: %f.%n", doubleNum);
			System.out.println("Now we will test your floating-point number in a math equation...");
			System.out.printf("Adding 10 to your float would be: 10 + %f = %f.%n", doubleNum, doubleNum + 10);
			System.out.println();

			// Get a 'Y' or 'N' from the user
			playAgain = getValidYN(in, "Would you like to play again? (Y/N): ",
					"Invalid Response! Please answer with a 'Y' or 'N'");
			System.out.println();
		} // end of while (playAgain.equalsIgnoreCase("y"))

		System.out.println("Goodbye!");
		in.close();

	}
    
    public static int getValidInt(Scanner in, String question, String warning) {
        String input = "";
        Integer myInteger = 0;
        Boolean keepTryingInputFail = true;

        do {
            try {
                System.out.println(question);
                input = in.nextLine();
                myInteger = Integer.parseInt(input);
                keepTryingInputFail = false;
            } catch (Exception e) {
                System.out.println(warning + "\n");
            }
        } while (keepTryingInputFail);

        return myInteger;
    }

    public static double getValidDouble(Scanner in, String question, String warning) {
        String input = "";
        Double myDouble = 0.0;
        Boolean keepTryingInputFail = true;

        do {
            try {
                System.out.println(question);
                input = in.nextLine();
                myDouble = Double.valueOf(input);
                keepTryingInputFail = false;
            } catch (Exception e) {
                System.out.println(warning + "\n");
            }
        } while (keepTryingInputFail);

        return myDouble;
    }

    public static String getValidYN(Scanner in, String question, String warning) {
        String input = "";
        Boolean keepTryingInputFail = true;
        do {
            System.out.println(question);
            input = in.nextLine();
            
            if (input.equalsIgnoreCase("Y")) {
                keepTryingInputFail = false;
            } else if (input.equalsIgnoreCase("N")) {
                keepTryingInputFail = false;

            } else {
                System.out.print(warning + "\n\n");
                keepTryingInputFail = true;
            }

        } while (keepTryingInputFail);

        return input;
    }
}

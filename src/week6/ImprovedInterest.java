package week6;

import java.util.Locale;
import java.util.Scanner;

public class ImprovedInterest {
    public static void main(String[] args) throws Exception {
        System.out.println(
                "This program will ask the user for a monthly deposit, an annual interest rate, and the number of months the user plans on saving.\nIt will then show the monthly balance over the period of planned savings.\n");
        Scanner in = new Scanner(System.in);
        String input = "";
        Double monthlyDepositAmount = 0.0;
        Double interestRate = 0.0;
        Integer monthsToSave = 0;
        Boolean firstInputFail = true;
        Boolean secondInputFail = true;
        Boolean thirdInputFail = true;

        Boolean keepPlaying = true;
        Boolean keepPlayingInputFail = true;

        Double totalAmount = 0.0;
        Double ratePerMonth = 0.0;

        do {
            firstInputFail = true;
            secondInputFail = true;
            thirdInputFail = true;
            keepPlayingInputFail = true;
            totalAmount = 0.0;
            ratePerMonth = 0.0;
            do {
                try {
                    System.out.println("Please enter the amount to be deposited each month: ");
                    input = in.nextLine();
                    monthlyDepositAmount = Double.valueOf(input);
                    firstInputFail = false;
                } catch (Exception e) {
                    System.out.println("Invalid response! Please enter a number.\n");
                }
            } while (firstInputFail);

            do {
                try {
                    System.out.println("Please enter the annual interest rate: ");
                    input = in.nextLine();
                    interestRate = Double.valueOf(input);
                    secondInputFail = false;
                    ratePerMonth = interestRate / 100 / 12;
                } catch (Exception e) {
                    System.out.println("Invalid response! Please enter a number.\n");
                }
            } while (secondInputFail);

            do {
                try {
                    System.out.println("Please enter the number of months you plan to save: ");
                    input = in.nextLine();
                    monthsToSave = Integer.parseInt(input);
                    thirdInputFail = false;
                } catch (Exception e) {
                    System.out.println("Invalid Response! Please enter a whole number.\n");
                }
            } while (thirdInputFail);

            System.out.println("The following table shows the balance of the account for each month of the designated savings period.");
            System.out.printf("%-20s%-20s%n", "Months", "Balance");

            for (Integer i = 1; i <= monthsToSave; i++) {
                totalAmount = (monthlyDepositAmount + totalAmount) * (1 + ratePerMonth);
                String auxMonth = i + ":";
                System.out.printf(Locale.US, "Month %-14s$%,.2f%n", auxMonth, totalAmount);
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
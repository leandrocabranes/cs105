package week3;

import java.util.Scanner;

public class Interest {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        String input = new String();

        System.out.println("Please enter the amount to be deposited each month:");
        input = in.nextLine();
        Double initialDeposit = Double.valueOf(input);
        System.out.println();

        System.out.println("Please enter the annual interest rate percent:");
        input = in.nextLine();
        Double rate = Double.valueOf(input);
        System.out.println();

        // start
        Double totalAmount = 0.0;
        Double ratePerMonth = rate / 100 / 12;

        // 1
        totalAmount = (initialDeposit + totalAmount) * (1 + ratePerMonth);
        // 2
        totalAmount = (initialDeposit + totalAmount) * (1 + ratePerMonth);
        // 3
        totalAmount = (initialDeposit + totalAmount) * (1 + ratePerMonth);
        // 4
        totalAmount = (initialDeposit + totalAmount) * (1 + ratePerMonth);
        // 5
        totalAmount = (initialDeposit + totalAmount) * (1 + ratePerMonth);
        // 6
        totalAmount = (initialDeposit + totalAmount) * (1 + ratePerMonth);

        System.out.println("The ending balance after 6 months is: $" + totalAmount);

        in.close();
    }
}

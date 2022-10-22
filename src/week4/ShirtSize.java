package week4;

import java.util.Scanner;

public class ShirtSize {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        String input = new String();
        Integer chestSize = 0;
        String suggestedSize = new String();

        System.out.println("In this program, we will determine a man's shirt size based on the measurement in inches of the customer's chest.\nPlease enter the customer's chest measurement in inches:");
        input = in.nextLine();
        chestSize = Integer.parseInt(input);

        if (chestSize < 38) {
            suggestedSize = "S";
        } else if (chestSize >= 38 && chestSize < 40) {
            suggestedSize = "M";
        } else if (chestSize >= 40 && chestSize < 43) {
            suggestedSize = "L";
        } else if (chestSize >= 43 && chestSize < 46) {
            suggestedSize = "XL";
        } else {
            suggestedSize = "XXL";
        }
        System.out.println("A customer with a chest measurement of "+ chestSize +" inches needs to order a size "+ suggestedSize +".");
        in.close();
    }
}

package week5;

import java.util.Scanner;

public class NonNumericInputValidation {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        String input = "";
        Boolean valid = false;
        String msg = "";

        do {
            System.out.print("Do you like to code in Java? ");
            input = in.nextLine();

            if (input.equalsIgnoreCase("Y")) {
                valid = true;
                msg = "That's great! I do too!";
            } else if (input.equalsIgnoreCase("N")) {
                valid = true;
                msg = "That's ok. There are many other wonderful things in life to learn.";
            } else {
                System.out.print("Invalid Response! Please answer with a 'Y' or 'N'.\n\n");
            }
        } while (!valid);

        System.out.print(msg);

        in.close();
    }
}

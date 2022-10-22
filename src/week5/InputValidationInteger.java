package week5;

import java.util.Scanner;

public class InputValidationInteger {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        String input = "";
        Integer num1 = 0;
        Integer num2 = 0;
        Integer num3 = 0;
        Boolean valid = false;

        do {
            System.out.print("Please enter a number: ");
            input = in.nextLine();
            try {
                num1 = Integer.parseInt(input);
                valid = true;
            } catch (Exception e) {
                System.out.println("Error: Please enter a whole number.\n");
            }
        } while (!valid);

        num2 = num1 + 1000;
        num3 = num1 * 2;
        System.out.println("num1 = "+ num1);
        System.out.println("num2 = "+ num2);
        System.out.println("num3 = "+ num3);

        in.close();
    }
}

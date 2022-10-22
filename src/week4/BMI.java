package week4;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        String input = new String();
        Integer height = 0;
        Integer weight = 0;
        Double kilograms = 0.0;
        Double centimeters = 0.0;
        Double result = 0.0;
        String resultDescription = new String();

        System.out.println("In this program we will calculate a person's BMI.\n\nPlease enter a person's height in inches:");
        input = in.nextLine();
        height = Integer.parseInt(input);
        System.out.println("Please enter a person's weight in pounds:");
        input = in.nextLine();
        weight = Integer.parseInt(input);

        kilograms = weight * 0.45359237;
        centimeters = height * 0.0254;

        result = kilograms/(centimeters*centimeters);

        if (result < 18.5) {
            resultDescription = "Underweight";
        } else if (result >= 18.5 && result <= 24.9) {
            resultDescription = "Normal";
        } else if (result >= 25 && result <= 29.9) {
            resultDescription = "Overweight";
        } else {
            resultDescription = "Obese";
        }

        System.out.print("The person's BMI is: "+result+". The person has a BMI classification of: "+ resultDescription +".");
        in.close();
    }
}

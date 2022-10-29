package week8;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListSum {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        String keepPlaying = "y";
        String input = "";
        // Boolean inputFail = true;

        while (keepPlaying.equalsIgnoreCase("y")) {
            ArrayList<Integer> numList = new ArrayList<Integer>();
            System.out.println("This program will ask the user to enter a series of numbers.\nThe user may enter as many numbers as they wish, hitting the enter key with no data when they wish to stop.\nThe program will then display the array of numbers and the sum total of those numbers.\n\n");

            while(true) {
                try {
                    System.out.println("Please enter a number (or just hit enter to finish): ");
                    input = in.nextLine();
                    if (input.isEmpty()) {
                        break;
                    }
                    Integer tempInteger = Integer.parseInt(input);
                    numList.add(tempInteger);
                } catch (Exception e) {
                    System.out.println("Invalid Response! Please enter a whole number.\n");
                }
            }
            System.out.printf("%-20s%-20s%n", "Index", "Item");

            for (Integer i = 0; i < numList.size(); i++) {
                System.out.printf("%-20s%-20s%n", i.toString(), numList.get(i));
            }

            // #3 Finally, have your main() print how many elements there are in the ArrayList and their sum total.
            System.out.printf("There are %d items in the ArrayList.%n", numList.size());
            System.out.printf("The sum total of numbers in the ArrayList is %d.%n", sumValues(numList));
    
            // #4 After the program has finished, ask the user if they would like to play again. Use input validation to ensure the user answered with a 'Y' or an 'N'. Keep the program running in an infinite loop until the user indicates they want to quit.
            do {
                System.out.println("Do you wish to play again? (Y/N): ");
                keepPlaying = in.nextLine();

                if (!keepPlaying.equalsIgnoreCase("Y") && !keepPlaying.equalsIgnoreCase("N")) {
                    System.out.print("Invalid response. Please enter either a 'Y' or an 'N'.\n\n");
                }

            } while (!keepPlaying.equalsIgnoreCase("Y") && !keepPlaying.equalsIgnoreCase("N"));
        }

        in.close();
    }

    public static Integer sumValues(ArrayList<Integer> numbersList) {
        Integer total = 0;
        for (Integer i : numbersList) {
            total = total + i;
        }
        // #2 Have your main() call a second method that you write called sumValues(), passing the ArrayList as an argument. Your sumValues() method will add up all the numbers in the ArrayList and return the total back to main(). You must use a loop in your sumValues() method to add the numbers. Use of any Java method to add items in an ArrayList is not allowed. Do not print the sum in the sumValues() method; simply return it!  Print out the ArrayList of numbers with each number's corresponding ArrayList index, as shown in the example run, from the main().

        return total;
    }
}

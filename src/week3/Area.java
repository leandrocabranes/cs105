package week3;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        String input = new String();

        System.out.println("Please enter the width of the square:");
        input = in.nextLine();
        int sqWidth = Integer.parseInt(input);
        System.out.println();

        System.out.println("Please enter width of the rectangle:");
        input = in.nextLine();
        int recWidth = Integer.parseInt(input);
        System.out.println();

        System.out.println("Please enter height of the rectangle:");
        input = in.nextLine();
        int recHeight = Integer.parseInt(input);
        System.out.println();

        int sqArea = sqWidth * sqWidth;
        int recArea = recWidth * recHeight;

        System.out.println("The area of a square with a width of "+ sqWidth +" is "+ sqArea +".");
        System.out.println("The area of a rectangle with a width of "+ recWidth +" and a height of " + recHeight +" is "+ recArea +".");

        in.close();
    }
}

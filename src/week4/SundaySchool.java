package week4;

import java.util.Scanner;

public class SundaySchool {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        String input = new String();
        Integer age = 0;
        String sex = new String();
        String sundayClass = new String();

        System.out.println("This program will ask a member's age and sex and determine which class they should attend on Sunday.\n\nPlease enter the member's age:");
        input = in.nextLine();
        age = Integer.parseInt(input);

        if (age < 12) {
            if (age < 1) {
                sundayClass = "Babe in Arms";
            } else if (age >= 1 && age < 3) {
                sundayClass = "Nursery";
            } else {
                sundayClass = "Primary";
            }
        } else {
            System.out.println("Please enter the member's sex:");
            sex = in.nextLine();
            if (sex.equalsIgnoreCase("female")) {
                if (age >= 12 && age < 18) {
                    sundayClass = "Young Women";
                } else {
                    sundayClass = "Relief Society";
                }
            } else if (sex.equalsIgnoreCase("male")) {
                if (age >= 12 && age < 18) {
                    sundayClass = "Young Men";
                } else {
                    sundayClass = "Elders Quorum";
                }
            }
        }
        System.out.println("The member should attend "+ sundayClass+".");
        in.close();
    }
}

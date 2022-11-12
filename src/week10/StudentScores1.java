package week10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class StudentScores1 {
    public static void main(String[] args) {

        try {
            File gradesFile = new File("Student Assignment Scores.csv");
            Scanner fileScanner = new Scanner(gradesFile);
            while (fileScanner.hasNextLine()) {
                String data = fileScanner.nextLine();
                System.out.println(data);
            }
            fileScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}

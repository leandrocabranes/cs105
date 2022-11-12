package week10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentScores3 {
    public static void main(String[] args) {

        try {
            ArrayList<String> gradesArray = new ArrayList<String>();
            File gradesFile = new File("Student Assignment Scores.csv");
            Scanner fileScanner = new Scanner(gradesFile);
            while (fileScanner.hasNextLine()) {
                gradesArray.add(fileScanner.nextLine());   
            }
            System.out.printf("%-30s%-15s%n", "Students", "Assignment with 0");
            System.out.println("---------------------------------------------------------------------------");
            for (int i = 0; i < gradesArray.size(); i++) {
                String[] grades = gradesArray.get(i).split(",");
                Integer totalZeroes = 0;
                for (int j = 1; j < grades.length; j++) {
                    if (grades[j].equals("0")) {
                        totalZeroes = totalZeroes + 1;
                    }
                }
                if (totalZeroes > 0) {
                    System.out.printf("%-30s%-15d%n", grades[0], totalZeroes);
                }
            }
            fileScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }
}

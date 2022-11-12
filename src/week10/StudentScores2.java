package week10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentScores2 {
    public static void main(String[] args) {

        try {
            ArrayList<String> gradesArray = new ArrayList<String>();
            File gradesFile = new File("Student Assignment Scores.csv");
            Scanner fileScanner = new Scanner(gradesFile);
            while (fileScanner.hasNextLine()) {
                gradesArray.add(fileScanner.nextLine());   
            }
            for (int i = 0; i < gradesArray.size(); i++) {
                System.out.printf("%-30s%-7s%-7s%-7s%-7s%-7s%-7s%n", gradesArray.get(i).split(",")[0], gradesArray.get(i).split(",")[1], gradesArray.get(i).split(",")[2], gradesArray.get(i).split(",")[3], gradesArray.get(i).split(",")[4], gradesArray.get(i).split(",")[5], gradesArray.get(i).split(",")[6]);
                if (i == 0) {
                    System.out.println("---------------------------------------------------------------------------");
                }
            }
            fileScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }
}

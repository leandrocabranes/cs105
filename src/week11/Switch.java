package week11;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Boolean keepPlaying = true;
        String input = "";

        while (keepPlaying) {
            System.out.println("\nThis program will show the name of an Apostle based on the order he was called, with the Prophet positioned at #1.\n\nEnter a number between 1 and 15 to display the corresponding Apostle (or press Enter to quit):");
            input = in.nextLine();
            if (input.isEmpty()) {
                break;
            }
            String apostleName = "";

            switch (input) {
                case "1":
                    apostleName = "Russell M. Nelson";
                    break;
                case "2":
                    apostleName = "Dallin H. Oaks";
                    break;
                case "3":
                    apostleName = "M. Russell Ballard";
                    break;
                case "4":
                    apostleName = "Jeffrey R. Holland";
                    break;
                case "5":
                    apostleName = "Henry B. Eyring";
                    break;
                case "6":
                    apostleName = "Dieter F. Uchtdorf";
                    break;
                case "7":
                    apostleName = "David A. Bednar";
                    break;
                case "8":
                    apostleName = "Quentin L. Cook";
                    break;
                case "9":
                    apostleName = "D. Todd Christofferson";
                    break;
                case "10":
                    apostleName = "Neil L. Andersen";
                    break;
                case "11":
                    apostleName = "Ronald A. Rasband";
                    break;
                case "12":
                    apostleName = "Gary E. Stevenson";
                    break;
                case "13":
                    apostleName = "Dale G. Renlund";
                    break;
                case "14":
                    apostleName = "Gerrit W. Gong";
                    break;
                case "15":
                    apostleName = "Ulisses Soares";
                    break;
                default:
                    break;
            }

            if (apostleName.isEmpty()) {
                System.out.println("That's not a valid choice. Try again.");
            } else {
                System.out.printf("Number %s is: %s", input, apostleName);
                apostleName = "";
            }

        }

        in.close();
    }
}

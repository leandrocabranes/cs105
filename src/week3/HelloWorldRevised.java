package week3;

import java.util.Scanner;

public class HelloWorldRevised {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String name = in.nextLine();
        System.out.println("Hello " + name + "!");
        System.out.println();

        System.out.println("What is your favorite dessert?");
        String dessert = in.nextLine();
        System.out.println("I hope you like coding Java as much as you like to eat " + dessert);
        System.out.println();

        System.out.println("What is your favorite color?");
        String color = in.nextLine();
        System.out.println("So, you like the color "+ color +". My favorite color is 0000ff.");
        System.out.println();

        System.out.println("Where were you born?");
        String placeOfBirth = in.nextLine();
        System.out.println("I was born in Silicon Valley. If I had been born in "+ placeOfBirth +", perhaps we would have been friends.");
        System.out.println();

        System.out.println("What is your favorite kind of pet?");
        String animal = in.nextLine();
        System.out.println("I'm sure a "+ animal +" is safer than my pet. I have a pet mouse.... but it always BYTES! HaHaHa!");
        System.out.println();

        System.out.println("What is your favorite insect?");
        String insect = in.nextLine();
        System.out.println("Wow! You like "+ insect +"!?! I like spiders. They make great WEB sites but sometimes they BUG me!");
        System.out.println();

        System.out.println("Who was your favorite speaker at the last General Conference?");
        String ga = in.nextLine();
        System.out.println("I agree. "+ ga +" was great! I'm just glad they didn't make Java against the Word of Wisdom!!!");
        System.out.println();

        in.close();
    }
}

import java.util.Scanner;

public class DoItBetter {
    public static void main(String [] args){

        Scanner inputReader = new Scanner(System.in);

        String name;
        int miles, hotdogs, languages;

        System.out.println("Hey there! I would like to know more about you through a series of questions");

        System.out.print("Okay! Lets begin! What is your name?");
        name = inputReader.next();
        System.out.println("Nice to meet you, " + name + "!");

        System.out.print("How many miles can you run? ");
        miles = inputReader.nextInt();
        miles = miles * 2 + 1;
        System.out.println("Wow! That's all? I can run " + miles + " miles.");

        System.out.print("Okay. Now tell me, how many hotdogs can you eat? ");
        hotdogs = inputReader.nextInt();
        hotdogs = hotdogs * 2 + 1;
        System.out.println("You can't be serious! I can eat " + hotdogs + " easily.");

        System.out.print("I'm sure you can impress me with this answer. How many languages do you know? ");
        languages = inputReader.nextInt();
        languages = languages * 2 +1;
        System.out.println("Sigh... I still win this one. I can speak " + languages + "! Congrats on what you can do. ");

    }
}

import java.util.Scanner;

public class PassingTheTuringTes {
    public static void main(String[] args){

        Scanner inputReader = new Scanner(System.in);

        String name, favColor, favFood;
        int favNum, product;

        System.out.println("Hello There!");
        System.out.print("What is your name? ");
        name = inputReader.next();

        System.out.print("Hi, " + name + "! What's your favorite color? ");
        favColor = inputReader.next();

        System.out.println("Huh, " + favColor + "? My favorite color is Yellow." );

        System.out.println("I really like yellow, just the same as I like bananas! ");

        System.out.print("How about you? What is your favorite food, " + name + "? ");
        favFood = inputReader.next();

        System.out.println("Really? " + favFood + "? That's wild!");
        System.out.print("Speaking of favorites, what is your favorite number?");
        favNum = inputReader.nextInt();

        System.out.println(favNum + " is a cool number. Mine is 28.");
        product = favNum * 28;
        System.out.println("Did you know " + favNum + " * 28 is " + product + "? That's a cool number too");

        System.out.println("Well thanks for speaking with me, " + name + "! ");
    }
}

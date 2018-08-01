import java.util.Random;
import java.util.Scanner;

public class HighRoller {
    public static void main(String[] args){

        Random diceRoller = new Random();
        Scanner inputReader = new Scanner(System.in);

        int diceSides, rollResult;

        System.out.println("Welcome to HIGH ROLLER!!");
        System.out.print("How many sides does your dice have?");
        diceSides = inputReader.nextInt();

        System.out.println("TIME TO ROOOOOOLL THE DICE!");
        rollResult = diceRoller.nextInt(diceSides) + 1;
        System.out.println("I rolled a " + rollResult);

        if (rollResult == 1) {
            System.out.println("You rolled a critical failure!");
        }

    }
}

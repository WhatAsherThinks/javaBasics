import java.util.Random;
import java.util.Scanner;

public class GuessMeFinally {
    public static void main(String[] args){
        Scanner inputReader = new Scanner(System.in);
        Random randomizer = new Random();

        int AIChoice = randomizer.nextInt(101) - 100;
        int userChoice;
        int attemptNum = 1;

        System.out.println("Ive chosen a number between -100 and 100. Bet you can guess it!");

        do{
            System.out.print("Your Guess: ");
            userChoice = inputReader.nextInt();

            if (userChoice > AIChoice){
                System.out.println("Too bad, way too high. Try again!");
                attemptNum++;
            }else if(userChoice < AIChoice){
                System.out.println("Ha, nice try - too low! Try again!");
                attemptNum++;
            }
        } while(AIChoice != userChoice);

        if(userChoice == AIChoice){
            System.out.println("Finally, it's about time you got it! I chose " + AIChoice);
        }else if(userChoice == AIChoice && attemptNum == 1){
            System.out.println("Wow, nice guess! That was it");
        }
    }
}

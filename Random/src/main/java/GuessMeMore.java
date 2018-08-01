import java.util.Random;
import java.util.Scanner;

public class GuessMeMore {
    public static void main(String[] args){

        Random randomizer = new Random();
        Scanner inputReader = new Scanner(System.in);

        int userchoice;
        int aiChoice = randomizer.nextInt(100 + 1 - 0) - 100;

        System.out.println("I've chosen a number between -100 and 100. Betcha can't guess it!");

        do {

            System.out.print("Your guess: " );
            userchoice = inputReader.nextInt();

            if (userchoice < aiChoice) {
                System.out.println("Your guess was too low!");


            } if (userchoice > aiChoice) {
                System.out.println("Your guess was too high! Try again");
            }
        } while (userchoice != aiChoice);

        if(userchoice == aiChoice){
            System.out.println("WOW GOOD JOB! I chose " + aiChoice);
        }

    }
}

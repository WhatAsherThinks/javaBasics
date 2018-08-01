import java.util.Scanner;

public class GuessMe {
    public static void main(String[] args){
        Scanner inputReader = new Scanner(System.in);

        int AIChoice = 28;
        int userGuess;

        System.out.println("I've chosen a number. Betcha can't guess it!");
        System.out.print("Your Guess: ");
        userGuess = inputReader.nextInt();

        if(userGuess < AIChoice){
            System.out.println("Ha, nice try - too low! I chose " + AIChoice + ".");
        } else if( userGuess > AIChoice){
            System.out.println("Too bad, way too high. I chose " + AIChoice + ".");
        }else if ( userGuess == AIChoice){
            System.out.println("Wow, nice guess! That was it!");
        }
    }
}

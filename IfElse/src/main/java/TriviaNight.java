import java.util.Scanner;

public class TriviaNight {
    public static void main(String[] arga){
        Scanner inputReader = new Scanner(System.in);

        int isCorrect = 0;
        int isWrong = 0;
        int userChoice = 0;

        System.out.println("It's TRIVIA NIGHT!! Are you ready?");

        System.out.println("FIRST QUESTION: ");
        System.out.println("What is the Lowest Level Programming Language?\n" +
                "1) Source Code       2) Assembly Language\n" +
                "3) C#                4) Machine Code");
        userChoice = inputReader.nextInt();
        System.out.println("YOUR ANSWER: " + userChoice);

        if (userChoice == 4){
            isCorrect++;
        }else {
            isWrong++;
        }

        System.out.println("SECOND QUESTION: ");
        System.out.println(" Website Security CAPTCHA Forms Are Descended From the Work of?\n"
                + "1) Grace Hopper    2) Alan Turing\n" +
                "3) Charles Babbage   4) Larry Page");
        userChoice = inputReader.nextInt();
        System.out.println("YOUR ANSWER: " + userChoice);

        if (userChoice == 2){
            isCorrect++;
        }else{
            isWrong++;
        }

        System.out.println("LAST QUESTION: ");
        System.out.println("Which of These Sci-Fi Ships Was Once Slated for a Full-Size Replica in Las Vegas?\n" +
                "1) Serenity            2) The Battlestar Galactica\n" +
                "3) The USS Enterprise  4) The Millennium Falcon");
        userChoice = inputReader.nextInt();
        System.out.println("YOUR ANSWER: " + userChoice);

        if (userChoice == 3){
            isCorrect++;
        } else {
            isWrong++;
        }

        if (isCorrect >= 2){
            System.out.println("Nice job - you got " + isCorrect + " correct!");
        } else {
            System.out.println("Better luck next time! You got " + isCorrect + " correct.");
        }





    }
}

import java.util.Scanner;

public class AllTheTrivia {
    public static void main(String[] args){

        Scanner inputReader = new Scanner(System.in);

        String answer1, answer2, answer3, answer4;

        System.out.print("1,024 Gigabytes is equal to one what? ");
        answer1 = inputReader.next();

        System.out.print("In our solar system which is the only planet that rotates clockwise?");
        answer2 = inputReader.next();

        System.out.print("The largest volcano ever discovered in our solar system is located on which planet?");
        answer3 = inputReader.next();

        System.out.print("What is the most abundant element in the earth's atmosphere?");
        answer4 = inputReader.next();

        System.out.println("Wow, 1,024 Gigabytes is a " + answer4);
        System.out.println("I didn't know that the largest ever volcano was discovered on " + answer2);
        System.out.println("That's amazing that" + answer1 + " is the most abundant element in the atmosphere...");
        System.out.println(answer3 + " is the only planet that rotates clockwise, neat!");


    }
}

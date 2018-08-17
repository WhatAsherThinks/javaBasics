import java.util.Scanner;

public class TraditionalFizzBuzz {
    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);

        int userChoice;
        int fizzbuzz = 0;

        System.out.println("How much units fizzing and buzzing do you need in your life?");
        userChoice = inputReader.nextInt();

        for (int i = 0; i <= 100; i++) {

            if ((i % 15 == 0) && (i != 0)) {
                System.out.println("Fizzbuzz");
                fizzbuzz++;
            } else if (i % 5 == 0 && i != 0) {
                System.out.println("Buzz");
                fizzbuzz++;
            } else if (i % 3 == 0 && i != 0) {
                System.out.println("Fizz");
                fizzbuzz++;
            } else if (userChoice == fizzbuzz) {
                break;
            } else {
                System.out.println(i);
            }
        }
            System.out.println("TRADITION!!!!");
        }
    }


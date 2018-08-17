import java.util.Scanner;

public class TwoForsAndTenYearsAgo {
    public static void main(String[] args){
        Scanner inputReader = new Scanner(System.in);
        System.out.print("What year would you like to count back from? ");
        int year = inputReader.nextInt();

        //This loop counts to 10 more years incrementing with each loop
        for (int i = 0; i <= 10; i++) {
            System.out.println(i + " years ago would be " + (year - i));
        }

        System.out.println("\nI can count backwards using a different way too...");

        //This loop goes from a year down to 10
        //This loop uses the variable in the iteration and initialization
        for (int i = year; i >= year - 20; i--) {
            System.out.println( (year - i) + " years ago would be " + i);
        }
    }
}

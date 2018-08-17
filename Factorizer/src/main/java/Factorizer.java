import java.util.Scanner;

public class Factorizer {
    public static void main(String[] args){
        Scanner inputReader = new Scanner(System.in);

        int perfect = 0;
        int prime = 1;

        System.out.print("What number would you like to factor? ");
        int userChoice = inputReader.nextInt();
        System.out.println("The factors of " + userChoice + " are: " );

        for(int i = 1; i <= userChoice; i++){
            if(userChoice % i == 0){
                perfect += i;
                System.out.println(i);
            }
        }
        if(perfect - userChoice == userChoice){
            System.out.println(userChoice + " is a perfect number.");
        }else{
            System.out.println(userChoice + " is not a perfect number.");
        }
        if(userChoice - (userChoice -1) == prime){
            System.out.println(userChoice + " is a prime number.");
        }else{
            System.out.println(userChoice + " is not a prime number.");
        }

    }
}

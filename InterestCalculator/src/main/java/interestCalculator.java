import java.util.Scanner;

public class interestCalculator {
    public static void main(String[] args){
        Scanner inputReader = new Scanner(System.in);

        int year, currentYear, quarters;
        double principal;
        double annualInterestRate;
        double quarterlyInterestRate;
        double currentBalance;

        System.out.print("Hello, How are you? What year is it currently? ");
        currentYear = inputReader.nextInt();
        System.out.print("What is the Annual Interest Rate? ");
        annualInterestRate = inputReader.nextDouble();
        quarterlyInterestRate = (annualInterestRate / 4);
        System.out.print("How many years would you like the fund to take effect? ");
        year = inputReader.nextInt();
        quarters = year * 4;

        System.out.print("What is your current balance? ");
        currentBalance = inputReader.nextDouble();

        for(int i = 1; i <= quarters; i++){
            principal = currentBalance * (1+ (quarterlyInterestRate/100));
            currentBalance = principal;
            System.out.println(i + "   " +currentBalance);
            if(i % 4 == 0){
                currentYear++;
                System.out.println("It's year " + currentYear + ", and your current balance is: " + currentBalance);
            }
        }




    }
}

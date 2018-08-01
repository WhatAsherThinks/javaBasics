import java.util.Scanner;

public class StayPositive {
    public static void main(String[] args){

        Scanner inputReader =  new Scanner(System.in);

        int num, userNum;
        int numPrinted = 0;

        System.out.print("What number should I count down from? ");
        userNum = inputReader.nextInt();

        while (userNum >= 0){
            if (numPrinted % 10 == 0) {
                System.out.println();
            }
            System.out.print(userNum + " ");
            userNum--;
            numPrinted++;
        }

        System.out.println("Whew... better stop there.");
    }
}

import java.util.Scanner;

public class BiggerBetterAdder {
    public static void main(String[] args){

        Scanner inputReader = new Scanner(System.in);

        int variable1, variable2, variable3, sum;

        System.out.println("Please enter the first variable (integers only)");
        variable1 = inputReader.nextInt();
        System.out.println("Please enter the second variable (integers only)");
        variable2 = inputReader.nextInt();
        System.out.println("Please enter the third variable (integers only)");
        variable3 = inputReader.nextInt();

        sum = variable1 + variable2 + variable3;

        System.out.println("The sum of your variables is: " + sum);
    }
}

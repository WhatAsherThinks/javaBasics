import java.util.Scanner;

public class ForTimes {
    public static void main(String[] args){
        Scanner inputReader = new Scanner(System.in);

        int times, product, i;

        System.out.print("Which times table should I recite? ");
        times = inputReader.nextInt();

        for (i = 1; i <= 15; i++){
            product = i * times;
            System.out.println(i + " * " + times + " is: " + product);
        }
    }
}

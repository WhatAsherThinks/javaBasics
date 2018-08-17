import java.util.Scanner;

public class ForTimesFor {
    public static void main(String[] args){
        Scanner inputReader = new Scanner(System.in);

        int times, product, i, userAnswer;
        int correct = 0;

        System.out.print("Which times table should I recite? ");
        times = inputReader.nextInt();

        for (i = 1; i <= 15; i++){
            product = i * times;
            System.out.println(i + " * " + times + " is: ");
            userAnswer = inputReader.nextInt();
            if (userAnswer != product){
                System.out.println("Sorry no, the answer is: " + product);
            }else if (userAnswer == product){
                System.out.println("Correct!");
                correct++;
            }
        }

        if (correct < 15 * 0.5){
            System.out.println("You should study more. You only got " + correct + " correct.");
        }else if( correct > 15 * 0.9){
            System.out.println("Wow! Good job, you are a math WIZ! You got " + correct + " correct.");
        }

    }
}

import java.util.Scanner;

public class HealthyHearts {
    public static void main(String[] args){

        Scanner inputReader = new Scanner(System.in);

        double age, max, rangeMax, rangeMin;

        System.out.print("What is your age? ");
        age = inputReader.nextFloat();

        max = 220 - age;
        System.out.println("Your maximum heart rate should be " + max + " beats per minute");

        rangeMax = max * 0.85;
        rangeMin = rangeMax - 50;

        System.out.println("Your target HR zone is " + rangeMin + " - " + rangeMax + " beats per minute.");

    }
}

import java.util.Scanner;

public class YourLifeInMovies {
    public static void main(String[] args){
        Scanner inputReader = new Scanner(System.in);

        int yearOfBirth;
        String name;

        System.out.print("Hey, let's play a game! What's your name?");
        name = inputReader.next();

        System.out.print("Okay, " + name + ". When were you born? ");
        yearOfBirth = inputReader.nextInt();

        System.out.println("Well " + name + "...");

        if(yearOfBirth < 1965){
            System.out.println("MASH has been around for almost half a century!");
        } if (yearOfBirth < 1975){
            System.out.println("The original Jurassic Park release is closer to the lunar landing, than today");
        } if (yearOfBirth < 1985){
            System.out.println("Space Jam came out not last decade, but the one before THAT!");
        } if (yearOfBirth < 1995){
            System.out.println("The first Harry Potter came out over 15 years ago.");
        } if (yearOfBirth < 2005){
            System.out.println("Pixar's 'Up' came out half a decade ago.");
        }

    }
}

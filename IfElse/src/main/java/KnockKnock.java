import java.util.Scanner;

public class KnockKnock {
    public static void main(String[] args){
        Scanner inputReader = new Scanner(System.in);

        System.out.print("Knock Knock! Guess who!! ");
        String nameGuess = inputReader.nextLine();

        //you cannot put an equals (==) sign because then it will never actually be equal
        if(nameGuess.equals("Marty McFly")){
            System.out.println("Hey! That's right! I'm back!");
            System.out.println(".... from the Future.");
        }else{
            System.out.println("Dude, do I -look- like " + nameGuess);
        }

    }
}

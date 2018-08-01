import java.util.Scanner;

public class FieldDay {
    public static void main(String[] args){

        Scanner inputReader = new Scanner(System.in);

        String userName;

        System.out.print("Welcome to FIELD DAY! May I have your last name for check-in? ");
        userName = inputReader.next();



        if(userName.compareToIgnoreCase("Baggins") < 0 ){
            System.out.println("Thank you " + userName + ", You are on team Red Dragons. Have fun!");
        } else if (userName.compareToIgnoreCase("Baggins") > 0 && userName.compareToIgnoreCase("Dresden") < 0 ){
            System.out.println("Thank you " + userName + ", You are on team Dark Wizards. Have fun!");
        } else if (userName.compareToIgnoreCase("Dresden") > 0 && userName.compareToIgnoreCase("Howl") < 0 ) {
            System.out.println("Thank you " + userName + ", You are on team Moving Castles. Have fun!");
        } else if (userName.compareToIgnoreCase("Howl") > 0 && userName.compareToIgnoreCase("Potter") < 0 ){
            System.out.println("Thank you " + userName + ", You are on team Golden Snitches. Have fun!");
        } else if (userName.compareToIgnoreCase("Potter") > 0 && userName.compareToIgnoreCase("Vimes") < 0 ){
            System.out.println("Thank you " + userName + ", You are on team Night Guards. Have fun!");
        } else if (userName.compareToIgnoreCase("Vimes") > 0 ){
            System.out.println("Thank you " + userName + ", You are on team Black Holes. Have fun!");
        }

        System.out.println("Good luck at the games!!");

    }
}

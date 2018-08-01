import java.util.Scanner;

public class MIniZork {
    public static void main(String[] args){
        Scanner inputReader = new Scanner(System.in);

        System.out.println("You are standing in an open field west of a white house,");
        System.out.println("With a boarded front door.");
        System.out.println("There is a small mailbox here.");
        System.out.print("Go to the house, or open the mailbox? ");

        String action = inputReader.nextLine();

        if (action.equals("open the mailbox")) {
            System.out.println("You open the mailbox.");
            System.out.println("It's really dark in there.");
            System.out.print("Look inside or stick your hand in? ");
            action = inputReader.nextLine();

            if (action.equals("look inside")) {
                System.out.println("You peer inside the mailbox.");
                System.out.println("It's really very dark. So ... so very dark.");
                System.out.print("Run away or keep looking? ");
                action = inputReader.nextLine();

                if (action.equals("keep looking")) {
                    System.out.println("Turns out, hanging out around dark places isn't a good idea.");
                    System.out.println("You've been eaten by a grue.");
                } else if (action.equals("run away")) {
                    System.out.println("You run away screaming across the fields - looking very foolish.");
                    System.out.println("But you alive. Possibly a wise choice.");
                }

            } else if (action.equals("stick your hand in")) {
                System.out.println("You stick your hand inside the mailbox.");
                System.out.println("You feel something sticky and squishy at the bottom.");
                System.out.println("keep searching or run away?");
                action = inputReader.nextLine();

                if(action.equals("keep searching")){
                    System.out.println("Your hands are covered in some weird substance, but you feel a small box. What can it be?");
                    System.out.println("Open box or run away?");
                    action = inputReader.nextLine();

                    if(action.equals("open box")){
                        System.out.println("you've discovered a giant diamond ring!! WOW");
                    }else if (action.equals("run away")){
                        System.out.println("You run away screaming across the fields - looking very foolish.");
                        System.out.println("But you alive. Possibly a wise choice.");
                    }
                }else if (action.equals("run away")){
                    System.out.println("You run away screaming across the fields - looking very foolish.");
                    System.out.println("But you alive. Possibly a wise choice.");
                }
            }

        } else if (action.equals("go to the house")) {
            System.out.println("Ahh the comforts of home. What to do now?");
            System.out.println("TV or computer?");
            action = inputReader.nextLine();

            if(action.equalsIgnoreCase("tv")){
                System.out.println("Breaking News! Mailman accidentally puts 1 million dollars cash in a mailbox on his route!");
                System.out.println("*News reporter* Sounds better than any Amazon package I've received. ");
                System.out.println("Check mailbox or keep watching");
                action = inputReader.nextLine();

                if (action.equalsIgnoreCase("check mailbox")){
                    System.out.println("Finds strange package.");
                    System.out.println("Finds a stockpile of letters from bill collectors. Dang it!");
                }else if (action.equalsIgnoreCase("keep watching")){
                    System.out.println("Turns out the mailman is an undercover billionaire spreading wealth");
                    System.out.println("He is facing charges for not reporting the money spent. The IRS is on attack. What a shame.");
                }
            }else if (action.equalsIgnoreCase("computer")){
                System.out.println("You've been RICK ROLLED");
                System.out.println("*NEVER GONNA GIVE YOU UP! NEVER GONNA LET YOU DOWN! NEVER GONNA RUN AROUND AND DESERT YOU!");
                System.out.println("Close window or pull plug?");
                action = inputReader.nextLine();

                if (action.equalsIgnoreCase("close window")){
                    System.out.println("*12 pop-up windows appear on screen*");
                    System.out.println("NEVER GONNA MAKE YOU CRY! NEVER GONNA SAY GOODBYE! NEVER GONNA TELL A LIE AND HURT YOU!");
                } else if ( action.equalsIgnoreCase("pull plug")){
                    System.out.println("That was a close one!");
                    System.out.println("People have been getting Rick Rolled to death! Whew!");
                }
            }
        }

    }
}


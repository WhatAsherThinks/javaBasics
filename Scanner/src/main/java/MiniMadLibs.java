import java.util.Scanner;

public class MiniMadLibs {
    public static void main(String[] args){

        Scanner inputReader = new Scanner(System.in);

        String noun1, adj1, noun2, adj2, pluralNoun1, pluralNoun2, pluralNoun3, presentVerb, pastVerb;
        int num1;

        System.out.println("Let's Play MADLIBS!");

        System.out.print("I need a noun: ");
        noun1 = inputReader.next();
        System.out.print("Now an adjective: ");
        adj1 = inputReader.next();
        System.out.print("Another noun: ");
        noun2 = inputReader.next();
        System.out.print("And a number: ");
        num1 = inputReader.nextInt();
        System.out.print("Another adjective: ");
        adj2 = inputReader.next();
        System.out.print("A plural noun: ");
        pluralNoun1 = inputReader.next();
        System.out.print("Another one: ");
        pluralNoun2 = inputReader.next();
        System.out.print("One more: ");
        pluralNoun3 = inputReader.next();
        System.out.print("A verb (Present tense): ");
        presentVerb = inputReader.next();
        System.out.print("Same verb (Past tense): ");
        pastVerb = inputReader.next();

        System.out.println("*** NOW LETS GET MAD (libs) ***");

        System.out.println( noun1 + ": the " + adj1 + " frontier. These are the voyages of the starship "
                + noun2 + ". Its " + num1+ "-year mission: to explore strange " + adj2 + " " + pluralNoun1 +
                ", to seek out " + adj2 + " " + pluralNoun2 + " and " + adj2 + " " + pluralNoun3 + ", to boldly "
                + presentVerb + " where no one has " + pastVerb + " before.");


    }
}

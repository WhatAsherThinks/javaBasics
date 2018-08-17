import java.util.Scanner;

public class DoOrDoNot {
    public static void main(String[] args){
        Scanner inputReader = new Scanner(System.in);
        System.out.print("Should I do it? (y/n) ");
        boolean doIt;

        if (inputReader.next().equals("y")) {
            doIt = true; // DO IT!
        } else {
            doIt = false; // DON'T YOU DARE!
        }

        boolean iDidIt = false;

//        do {
//            iDidIt = true;
//            break;
//        } while (doIt);


        //if you use this while loop it will only perform the ir or else condition because it will
        // not go into the while loop if you choose "n"
        while(doIt){
            iDidIt = true;
            break;
        }

        if (doIt && iDidIt) {
            //This is what is say if you choose y
            System.out.println("I did it!");
        } else if (!doIt && iDidIt) {
            //this is what happens if you say n
            System.out.println("I know you said not to ... but I totally did anyways.");
        } else {
            System.out.println("Don't look at me, I didn't do anything!");
        }

    }
}

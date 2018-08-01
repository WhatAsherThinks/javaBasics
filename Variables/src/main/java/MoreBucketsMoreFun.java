public class MoreBucketsMoreFun {
    public static void main(String[] args){
        // Declare everything
        // usually its a good idea to declare all variable at the beginning of a program
        int butterflies, beetles, bugs;
        String color, size, shape, thing;
        double number;

        // Now give a couple of them values
        butterflies = 2;
        beetles = 4;

        bugs = butterflies + beetles;

        System.out.println("there are only " + butterflies + " butterflies,");
        System.out.println("but " + bugs + " bugs total." );

        System.out.println("Uh Oh! My dog ate one...");
        // This is the decrement operator. it decreases value by 1
        butterflies--;
        System.out.println("Now there are only " + butterflies + " butterflies left");
        System.out.println("But still " + bugs + " bugs left, wait a minute!!!");
        // The number of bugs didn't change because it is still using the original amount
        // of butterflies that was originally assigned. You would have to do the operation again with
        // the new butterflies amount to get the updated 'bugs'
        System.out.println("Maybe I just counted wrong the first time.");
    }
}

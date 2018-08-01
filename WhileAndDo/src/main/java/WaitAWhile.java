public class WaitAWhile {
    public static void main(String[] args){
        //if you change timeNow to a time greater than bedTime, it will always say go to sleep
        int timeNow = 5;
        //if you change bedTime to a larger number, it will take more iterations of the loop before prompting sleep
        int bedTime = 10;

        while (timeNow < bedTime) {
            System.out.println("It's only " + timeNow + " o'clock!");
            System.out.println("I think I'll stay up just a liiiiittle longer....");
            //if you don't have an incrementer, it will be an endless loop
            timeNow++; // Time passes
        }

        System.out.println("Oh. It's " + timeNow + " o'clock.");
        System.out.println("Guess I should go to bed ...");
    }
}

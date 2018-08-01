import java.util.Random;

public class CoinFlipper {
    public static void main(String[] args){
        Random randomizer = new Random();

        int coinSide = randomizer.nextInt(2);

        System.out.println("Ready, set , FLIP...!!");

        if(coinSide == 0){
            System.out.println("You got TAILS!");
        }else{
            System.out.println("You got HEADS!");
        }

    }
}

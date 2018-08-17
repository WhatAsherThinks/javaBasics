import java.util.Random;

public class MaybeItLovesMe {
    public static void main(String[] args){
        Random randomizer = new Random();

        int flowerPetals = randomizer.nextInt(89- 13) + 13;
        boolean isEven= false;

        if(flowerPetals % 2 == 0){
            isEven = true;
        }

        System.out.println("Here goes nothing!");
        while(flowerPetals > 0){
            if(flowerPetals % 2 == 0){
                System.out.println("It Loves me not...");
                flowerPetals--;
            }else {
                System.out.println("It Loves me!!");
                flowerPetals--;
            }
        }

        if(isEven == false){
            System.out.println("Yay! It Loves me!");
        }else if (isEven == true){
            System.out.println("Oh no! It doesn't love me... Bummer.");
        }

    }
}

public class LovesMe {
    public static void main(String[] args){

        int flowerPetals = 34;
        System.out.println("Here goes nothing...");

        while (flowerPetals > 0){
            if (flowerPetals % 2 ==0){
                System.out.println("It loves me not...");
                flowerPetals --;
            }else{
                System.out.println("It loves me!");
                flowerPetals--;
            }
        }

        System.out.println("I knew it! It loves me!!");
    }
}

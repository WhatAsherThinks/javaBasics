public class SpaceRustlers {
    public static void main(String[] args){
        int spaceships = 10;
        int aliens = 25;
        int cows = 100;

        if(aliens > spaceships){
            System.out.println("Vrroom, vroom! Let's get going!");
        }
        // if you remove the else statement, it wont execute outside conditions not satisfied in the if or elseif
        else{
            System.out.println("There aren't enough green guys to drive these ships!");
        }

        // if this is true, it will perform what is inside the if block
        if(cows == spaceships){
            System.out.println("Wow, way to plan ahead! JUST enough room for all these walking hamburgers!");
        }
        // the else if can be read as "otherwise" it will only do whats in the elseif block is its true
        else if (cows > spaceships){
            System.out.println("Dangit! I don't how we're going to fit all these cows in here!");
        } else {
            System.out.println("Too many ships! Not enough cows.");
        }

        if(aliens > cows){
            System.out.println("Hurrah, we've got the grub! Hamburger party on Alpha Centauri!");
        }else if (aliens <= cows){
            System.out.println("Oh no! The herds got restless and took over! Looks like _we're_ hamburger now!!");
        }

    }
}

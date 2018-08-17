import java.util.Random;

public class LazyTeenager {
    public static void main(String[] args) {

        Random randomizer = new Random();
        int timesTold = 0;
        double chance = .05;
        double cleanRoom = randomizer.nextDouble();

        while (timesTold <= 15) {

        if (cleanRoom > chance) {
            timesTold++;
            System.out.println("Clean your room!!! (" + timesTold + "x}");
            chance += 0.05;

        } else if (cleanRoom <= chance) {
            System.out.println("FINE! I'LL CLEAN MY ROOM. BUT I REFUSE TO EAT MY PEAS.");
            break;
        }
    }
        if(timesTold >15){
            System.out.println("Clean your room!! That's IT, I'm doing it!!! YOU'RE GROUNDED AND I'M TAKING YOUR XBOX!");

        }

    }
}

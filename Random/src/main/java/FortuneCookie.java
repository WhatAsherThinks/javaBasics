import java.util.Random;

public class FortuneCookie {
    public static void main(String[] args){
        Random randomizer = new Random();

        int num = randomizer.nextInt(11);
        String fortune = "";

        switch (num){
            case 1:
                fortune ="Those aren’t the droids you’re looking for.";
                break;
            case 2:
                fortune = "Never go in against a Sicilian when death is on the line!";
                break;
            case 3:
                fortune = "Goonies never say die.";
                break;
            case 4:
                fortune = "With great power there must also come — great responsibility.";
                break;
            case 5:
                fortune = "Never argue with the data.";
                break;
            case 6:
                fortune = "Try not. Do, or do not. There is no try.";
                break;
            case 7:
                fortune = "You are a leaf on the wind, watch how you soar.";
                break;
            case 8:
                fortune = "Do absolutely nothing, and it will be everything that you thought it could be.";
                break;
            case 9:
                fortune = "Kneel before Zod.";
                break;
            case 10:
                fortune = "Make it so.";
                break;
            default:
                fortune = "Fortune Cookies are fake. Make your own fate";
        }

        System.out.println(fortune);

    }
}

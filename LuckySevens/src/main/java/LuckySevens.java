import jdk.nashorn.internal.ir.WhileNode;

import java.util.Random;
import java.util.Scanner;

public class LuckySevens {
    public static void main(String[] args){
        roll();
    }

    static void roll(){
        Random randomizer = new Random();
        Scanner inputReader = new Scanner(System.in);

        int userMoney;
        int maxMoney;
        int rolls = 0;
        int maxRoll = 0;
        int dice1, dice2;
        int rollResult;

        System.out.print("How much money do you have? ");
        userMoney = inputReader.nextInt();
        maxMoney = userMoney;

        while (userMoney > 0 ){
            dice1 = randomizer.nextInt(6)+1;
            dice2 = randomizer.nextInt(6)+1;
            rollResult = dice1 + dice2;
            if (rollResult == 7){
                userMoney += 4;
                rolls++;
            }
            if(userMoney > maxMoney){
                maxMoney = userMoney;
                maxRoll = rolls;
            }
            else if( rollResult != 7){
                userMoney -= 1;
                rolls++;
            }
        }

        System.out.println("You are broke after " + rolls + " rolls.");
        System.out.println("You should have quit after " + maxRoll + " rolls, when you had $" + maxMoney+ ".");

    }
}



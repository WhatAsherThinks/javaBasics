import java.util.Scanner;

public class BirthStones {
    public static void main(String[] args){

        Scanner inputReader = new Scanner(System.in);

        int monthNum;

        System.out.print("What month were you born? (Numbers only) ");
        monthNum = inputReader.nextInt();

        if(monthNum == 1){
            System.out.println("1 - January - Garnet");
        } else if (monthNum == 2){
            System.out.println("2 - February - Amethyst");
        } else if (monthNum == 3){
            System.out.println("3 - March - Aquamarine");
        }else if (monthNum == 4){
            System.out.println("4 - April - Diamond");
        }else if (monthNum == 5){
            System.out.println("5 - May - Emerald");
        }else if (monthNum == 6){
            System.out.println("6 - June - Pearl");
        }else if (monthNum == 7){
            System.out.println("7 - July - Ruby");
        }else if (monthNum == 8){
            System.out.println("8 - August - Peridot");
        }else if (monthNum == 9){
            System.out.println("9 - September - Sapphire");
        }else if (monthNum == 10){
            System.out.println("10 - October - Opal");
        } else if (monthNum == 11){
            System.out.println("11 - November - Topaz");
        } else if (monthNum == 12){
            System.out.println("12 - December - Turquoise");
        }else {
            System.out.println("There is an error with your input. Invalid Month");
        }

    }
}

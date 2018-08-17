import java.util.Scanner;

public class TheCount {
    public static void main(String[] args){
        Scanner inputReader = new Scanner(System.in);

        int start, increment, end;
        int counter = 0;

        System.out.println("*** I LOVE TO COUNT! LET ME SHARE MY COUNTING WITH YOU! ***");
        System.out.print("Start at: ");
        start = inputReader.nextInt();
        System.out.print("Stop at: ");
        end = inputReader.nextInt();
        System.out.print("Count by: ");
        increment = inputReader.nextInt();

        for(int i = start; i <= end; i += increment){
            System.out.print(i + " ");
            counter++;
            if(counter % 3 == 0){
                System.out.print(" - Ah ah ah! \n" );
            }
        }
    }
}

public class SpringForwardFallBack {
    public static void main(String[] args){
        System.out.println("It's Spring...!");
        //the range is 1 to 10
        for (int i = 1; i < 11; i++) {
            System.out.print(i + ", ");
        }

        System.out.println("\nOh no, it's fall...");
        //the range is 10 to 1
        for (int i = 10; i > 0; i--) {
            System.out.print(i + ", ");
        }

    }
}

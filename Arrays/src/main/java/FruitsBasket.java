public class FruitsBasket {
    public static void main(String[] args) {
        int fruitCount = 0;
        int orangeCount = 0;
        int appleCount = 0;
        String[] fruit = {"Orange", "Apple", "Orange", "Apple", "Orange", "Apple", "Orange", "Apple", "Orange", "Orange", "Orange", "Apple", "Orange", "Orange", "Apple", "Orange",
                "Orange", "Apple", "Apple", "Orange", "Apple", "Apple", "Orange", "Orange", "Apple", "Apple", "Apple", "Apple", "Orange", "Orange", "Apple", "Apple", "Orange", "Orange",
                "Orange", "Orange", "Apple", "Apple", "Apple", "Apple", "Orange", "Orange", "Apple", "Orange", "Orange", "Apple", "Orange", "Orange", "Apple", "Apple", "Orange", "Orange",
                "Apple", "Orange", "Apple", "Orange", "Apple", "Orange", "Apple", "Orange", "Orange"};

        for (int i = 0; i < fruit.length; i++) {
            //This sets up the array length for oranges
            if (fruit[i].equalsIgnoreCase("Orange")) {
                orangeCount++;
                //This sets up the array length for apples
            } else if (fruit[i].equalsIgnoreCase("Apple")) {
                appleCount++;
            }
            //This shows how many fruits there are
            fruitCount++;
        }
        System.out.println("Total number of Fruit in Basket: " + fruitCount);

        String[] orange = new String[orangeCount];
        String[] apple = new String[appleCount];

        //This iterates through the fruitbasket array
        for (int i = 0; i < fruit.length; i++) {
            //This iterate through the new orange array
            for (int j = 0; j < orange.length; j++) {
                //if the fruitbasket array has orange, it puts it into the current index of the orange array
                if (fruit[i].equalsIgnoreCase("Orange")) {
                    orange[j] = fruit[i];
                }
            }
            //this iterates through the new apple array
            for (int k = 0; k < apple.length; k++) {
                //if the fruitbasket array has apple, it puts it into the current index of the apple array
                if (fruit[i].equalsIgnoreCase("Apple")) {
                    apple[k] = fruit[i];
                }
            }

            System.out.println("Number of Apples: " + appleCount);
            System.out.println("Number of Oranges: " + orangeCount);


        }
    }
}

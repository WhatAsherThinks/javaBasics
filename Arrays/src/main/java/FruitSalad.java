public class FruitSalad {
    public static void main(String[] args){
        int apples = 0;
        int oranges = 0;
        int fruitBowl = 0;

        String apple = "Apple";
        String tomato = "Tomato";
        String berry = "berry";
        String orange = "Orange";

        String[] fruit = {"Kiwi Fruit", "Gala Apple", "Granny Smith Apple", "Cherry Tomato", "Gooseberry", "Beefsteak Tomato",
                "Braeburn Apple", "Blueberry", "Strawberry", "Navel Orange", "Pink Pearl Apple",  "Raspberry", "Blood Orange",
                "Sungold Tomato", "Fuji Apple", "Blackberry", "Banana", "Pineapple", "Florida Orange", "Kiku Apple", "Mango",
                "Satsuma Orange", "Watermelon", "Snozzberry"};

        String[] fruitSalad = new String[11];

//        for(int i = 0; i< fruitSalad.length; i++){
//            for(int j = 0; j< fruit.length; j++){
//                fruitSalad[i] = fruit[j];
//            }
//        }

//        for(int i = 0; i< fruit.length; i++){
////            System.out.println(fruit[i]);
//            for(int j = 0; j < fruitSalad.length; j++){
//                fruitSalad[j] = fruit[i];
//                System.out.println(fruitSalad[j]);
//            }
//
//        }

        for (int i = 0; i < fruit.length; i++){
            for(int j = 0; j < fruitSalad.length; j++){

                if(fruit[i].toLowerCase().contains(apple) && apples <= 3 && fruitBowl <= 12){
                    fruitSalad[j] = fruit[i];
                    apples++;
                    fruitBowl++;
                }
                else if(fruit[i].toLowerCase().contains(orange) && oranges <= 2 && fruitBowl <= 12){
                    fruitSalad[j] = fruit[i];
                    oranges++;
                    fruitBowl++;
                }
                else if ((!fruit[i].toLowerCase().contains(tomato)) && fruitBowl <= 12){
                    fruitSalad[j] = fruit[i];
                    fruitBowl++;
                }
            }
        }

        for (int k = 0; k< fruitSalad.length; k++){
            System.out.println(fruitSalad[k]);
        }

    }
}

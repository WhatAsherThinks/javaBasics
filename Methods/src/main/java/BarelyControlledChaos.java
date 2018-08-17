import java.util.Random;

public class BarelyControlledChaos {
    public static void main(String[] args){

        String color = chooseColor(); // call color method here
        String animal = chooseAnimal(); // call animal method again here
        String colorAgain = chooseColor(); // call color method again here
        int weight = chooseWeight(); // call number method,
        // with a range between 5 - 200
        int distance = chooseDistance(); // call number method,
        // with a range between 10 - 20
        int number = chooseNumber(); // call number method,
        // with a range between 10000 - 20000
        int time = chooseTime(); // call number method,
        // with a range between 2 - 6

        System.out.println("Once, when I was very small...");

        System.out.println("I was chased by a " + color + ", "
                + weight + "lb " + " miniature " + animal
                + " for over " + distance + " miles!!");

        System.out.println("I had to hide in a field of over "
                + number + " " + colorAgain + " poppies for nearly "
                + time + " hours until it left me alone!");

        System.out.println("\nIt was QUITE the experience, "
                + "let me tell you!");
    }

    public static String chooseColor(){
        Random randomizer = new Random();

        String color = "";
        int c = randomizer.nextInt(5)+1;

        if(c == 0){
            color = "blue";
        }else if(c == 1 ){
            color = "yellow";
        }else if(c == 2 ){
            color = "brown";
        }else if(c == 3 ){
            color = "orange";
        }else if(c == 4 ){
            color = "red";
        }
        return color;
    }

    public static String chooseAnimal(){
        Random randomizer = new Random();

        String animal = "";
        int a = randomizer.nextInt(5)+1;

        if(a == 0){
            animal = "giraffe";
        }else if(a == 1 ){
            animal = "goat";
        }else if(a == 2 ){
            animal = "dog";
        }else if(a == 3 ){
            animal = "cat";
        }else if(a == 4 ){
            animal = "alligator";
        }
        return animal;
    }

    public static int chooseWeight(){
        Random randomizer = new Random();
        int weight = randomizer.nextInt(195) + 5;
        return weight;
    }

    public static int chooseDistance(){
        Random randomizer = new Random();
        int distance = randomizer.nextInt(10)+10;
        return distance;
    }

    public static int chooseNumber(){
        Random randomizer = new Random();
        int number = randomizer.nextInt(10000)+20000;
        return number;
    }

    public static int chooseTime(){
        Random randomizer = new Random();
        int time = randomizer.nextInt(4)+2;
        return time;
    }

}

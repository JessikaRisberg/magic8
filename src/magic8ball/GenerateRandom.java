package magic8ball;

import java.util.Random;

public class GenerateRandom {
    public static void main(String[] args) {
        // creating an object of Random class
        Random rand = new Random();
        int upperbound = 9;
            // generate random values from 0-8
       int int_random = rand.nextInt(upperbound);

        System.out.println("Random int value 0 to " + (upperbound-1) + " : " + int_random);

    }
}

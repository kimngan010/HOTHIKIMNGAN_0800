package LEC5BTVN;

import java.util.Random;

public class BT3 {

    public static void main(String[] args) {
        Random so = new Random();
        int randNum = so.nextInt(78) + 3;
        System.out.println("random number: " + randNum);
        if (randNum % 2 == 0) {
            System.out.println("even number: " + randNum);
        } else {
            System.out.println("odd number: " + randNum);
        }
    }
}

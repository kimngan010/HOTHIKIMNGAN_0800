package LEC5BTVN;

import java.util.Random;

public class BT2 {

    public static void main(String[] args) {
        Random num = new Random();
        double rand = num.nextDouble() * 6.2 + 1.8;
        System.out.println("random number: " + rand);
    }
}

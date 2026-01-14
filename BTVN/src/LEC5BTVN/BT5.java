package LEC5BTVN;

import java.util.Scanner;
import java.util.*;

public class BT5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int random = rand.nextInt(10) + 1;

        int dem = 0;
        int n;
        do {
            System.out.print("nhap so nguyen: ");
            n = sc.nextInt();
            dem++;
            if (n != random) {
                System.out.println("nhap lai ");
            }
        } while (n != random);
        System.out.println("so lan dem: " + dem);
    }
}

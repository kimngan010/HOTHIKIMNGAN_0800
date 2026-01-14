package LEC5BTVN;

import java.util.*;
import java.util.Scanner;

public class BT6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random ran = new Random();
        int soDoan;
        int number = ran.nextInt(100) + 1;
        while (true) {
            System.out.print("nhap so doan: ");
            soDoan = sc.nextInt();
            if (soDoan == number) {
                System.out.println("Chuc mung!");
                break;
            } else if (soDoan < number) {
                System.out.println("goi y: nhap so lon hon");
            } else {
                System.out.println("goi y: nhap so nho hon");
            }
        }
    }
}

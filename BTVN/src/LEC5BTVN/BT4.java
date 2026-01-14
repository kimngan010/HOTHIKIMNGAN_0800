package LEC5BTVN;

import java.util.*;
import java.util.Scanner;

public class BT4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        System.out.print("nhap so thuc: ");
        double sothuc = sc.nextDouble();
        double number = random.nextDouble() * 99.00 + 1.0;
        System.out.println("so ngau nhien: " + number);
        if (sothuc > number) {
            System.out.println("so thuc lon hon so ngau nhien");
        } else if (sothuc < number) {
            System.out.println("so thuc nho hon so ngau nhien");
        } else {
            System.out.println("so thuc bang so ngau nhien");
        }
    }
}

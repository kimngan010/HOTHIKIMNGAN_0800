package BT_HAM;

import java.util.Scanner;

public class BT {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap mang n : ");
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("nhap " + i + " : ");
            a[i] = scanner.nextInt();
        }
        hienthi(a);
        daoNguoc(a, n);
        hienThiSoChan(a, n);
        tongChiaHetCho3va5(a);
        int tong = tongChiaHetCho3va5(a);
        System.out.println("Tong cac so chia het cho 3 va 5 la: " + tong);
        sapXepTangDan(a);
        sapXepGiamDan(a);
    }

    public static void hienthi(int[] a) {
        System.out.print("mang vua nhap: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void daoNguoc(int[] a, int n) {
        System.out.print("\nmang dao nguoc: ");
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static void hienThiSoChan(int[] a, int n) {
        System.out.print("cac so chan trong mang: ");
        for (int i = 0; i < n; i++) {
            if (a[i] % 2 == 0) { // Kiểm tra số chẵn
                System.out.print(a[i] + " ");
            }
        }
        System.out.println();
    }

    public static int tongChiaHetCho3va5(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static void sapXepTangDan(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.print("mang sap xep tang dan: ");
        for (int x : a) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    // f. Sắp xếp mảng giảm dần
    public static void sapXepGiamDan(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] < a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.print("mang sap xep giam dan: ");
        for (int x : a) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}

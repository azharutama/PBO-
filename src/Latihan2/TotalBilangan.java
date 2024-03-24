package Latihan2;

import java.util.Scanner;

public class TotalBilangan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta input jumlah bilangan
        System.out.print("N = ");
        int N = scanner.nextInt();

        // Memeriksa apakah N valid (bukan nol atau minus)
        if (N <= 0) {
            System.out.println("N tidak boleh nol atau minus");
        } else {
            // Meminta input N bilangan
            int total = 0;
            for (int i = 1; i <= N; i++) {
                System.out.print("Masukkan bilangan ke-" + i + ": ");
                int bilangan = scanner.nextInt();
                total += bilangan;
            }

            // Menampilkan total
            System.out.println("Total = " + total);
        }

        scanner.close();
    }
}
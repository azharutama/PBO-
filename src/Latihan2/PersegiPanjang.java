package Latihan2;
import java.util.Scanner;
public class PersegiPanjang {
    // Atribut kelas
    private int panjang; // Menyimpan nilai panjang persegi panjang
    private int lebar; // Menyimpan nilai lebar persegi panjang

    // Constructor untuk inisialisasi panjang dan lebar
    public PersegiPanjang(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    // Fungsi untuk menghitung luas
    public int hitungLuas() {
        return panjang * lebar;
    }

    // Fungsi untuk menghitung keliling
    public int hitungKeliling() {
        return 2 * (panjang + lebar);
    }

    // Metode untuk menampilkan nilai atribut panjang, lebar, luas, dan keliling
    public void tampil() {
        System.out.println("Panjang: " + panjang);
        System.out.println("Lebar: " + lebar);
        System.out.println("Luas: " + hitungLuas());
        System.out.println("Keliling: " + hitungKeliling());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta input dari pengguna untuk panjang dan lebar
        System.out.print("Panjang: ");
        int panjang = scanner.nextInt();
        System.out.print("Lebar: ");
        int lebar = scanner.nextInt();

        // Membuat objek PersegiPanjang
        PersegiPanjang persegiPanjang = new PersegiPanjang(panjang, lebar);

        // Menampilkan hasil
        persegiPanjang.tampil();

        scanner.close();
    }
}

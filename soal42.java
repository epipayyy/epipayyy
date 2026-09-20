import java.util.Scanner;

public class Terbesar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int terbesar;

        System.out.print("Masukkan angka ke-1: ");
        terbesar = input.nextInt();

        for (int i = 2; i <= 10; i++) {
            System.out.print("Masukkan angka ke-" + i + ": ");
            int angka = input.nextInt();

            if (angka > terbesar) {
                terbesar = angka;
            }
        }

        System.out.println("Bilangan terbesar = " + terbesar);
    }
}
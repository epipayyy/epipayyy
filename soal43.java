import java.util.Scanner;

public class Terkecil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int terkecil;

        System.out.print("Masukkan angka ke-1: ");
        terkecil = input.nextInt();

        for (int i = 2; i <= 10; i++) {
            System.out.print("Masukkan angka ke-" + i + ": ");
            int angka = input.nextInt();

            if (angka < terkecil) {
                terkecil = angka;
            }
        }

        System.out.println("Bilangan terkecil = " + terkecil);
    }
}
import java.util.Scanner;

public class JumlahGanjil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jumlahGanjil = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Masukkan angka ke-" + i + ": ");
            int angka = input.nextInt();

            if (angka % 2 != 0) {
                jumlahGanjil++;
            }
        }

        System.out.println("Jumlah bilangan ganjil = " + jumlahGanjil);
    }
}
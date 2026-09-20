import java.util.Scanner;

public class JumlahGenap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jumlahGenap = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Masukkan angka ke-" + i + ": ");
            int angka = input.nextInt();

            if (angka % 2 == 0) {
                jumlahGenap++;
            }
        }

        System.out.println("Jumlah bilangan genap = " + jumlahGenap);
    }
}
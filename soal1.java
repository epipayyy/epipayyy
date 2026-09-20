import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan kalimat: ");
        String kalimat = input.nextLine();

        System.out.print("Kalimat terbalik: ");

        for (int i = kalimat.length() - 1; i >= 0; i--) {
            System.out.print(kalimat.charAt(i));
        }

        input.close();
    }
}
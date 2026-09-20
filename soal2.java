import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {

        String kalimat = "halo saya selvi";
        char huruf = 's';

        int jumlah = 0;

        for (int i = 0; i < kalimat.length(); i++) {
            if (kalimat.charAt(i) == huruf) {
                jumlah++;
            }
        }

        System.out.println("Kalimat: " + kalimat);
        System.out.println("Huruf yang dicari: " + huruf);
        System.out.println("Jumlah huruf '" + huruf + "': " + jumlah);
    }
}
public class Soal15 {
    public static void main(String[] args) {

        for (int angka = 8; angka >= 1; angka--) {

            int kelompok = (8 - angka) / 2;

            if (kelompok % 2 == 0) {
                for (int i = angka; i >= 1; i--) {
                    System.out.print(i);
                }
            } else {
                for (int i = 1; i <= angka; i++) {
                    System.out.print(angka);
                }
            }
        }

        System.out.println();
    }
}
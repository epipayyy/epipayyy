public class Soal12 {
    public static void main(String[] args) {

        for (int angka = 1; angka <= 9; angka++) {

            int kelompok = (angka - 1) / 2;

            if (kelompok % 2 == 0) {
                for (int i = 1; i <= angka; i++) {
                    System.out.print(angka);
                }
            } else {
                for (int i = 1; i <= angka; i++) {
                    System.out.print(i);
                }
            }
        }

        System.out.println();
    }
}
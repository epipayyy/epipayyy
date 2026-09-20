public class Soal10 {
    public static void main(String[] args) {

        for (int angka = 6; angka >= 1; angka--) {

            if (angka % 2 == 0) {
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
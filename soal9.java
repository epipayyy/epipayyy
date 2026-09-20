public class Soal9 {
    public static void main(String[] args) {

        for (int angka = 1; angka <= 6; angka++) {

            if (angka % 2 == 1) {
                for (int i = 1; i <= angka; i++) {
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
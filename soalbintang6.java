public class Soal06 {
    public static void main(String[] args) {

        for (int i = 1; i <= 6; i++) {

            int jumlah;

            if (i <= 3) {
                jumlah = i;
            } else {
                jumlah = i - 3;
            }

            for (int j = 1; j <= jumlah; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
public class Soal05 {
    public static void main(String[] args) {

        for (int i = 6; i >= 1; i--) {

            for (int spasi = 1; spasi <= 6 - i; spasi++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
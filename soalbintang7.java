public class Soal07 {
    public static void main(String[] args) {

        for (int i = 5; i >= 1; i--) {

            for (int spasi = 1; spasi <= 5 - i; spasi++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        for (int i = 2; i <= 5; i++) {

            for (int spasi = 1; spasi <= 5 - i; spasi++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
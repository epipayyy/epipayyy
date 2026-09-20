public class soalbintang1 {
    public static void main(String[] args) {

        for (int i = 6; i >= 1; i--) {

            // Bintang sebelah kiri
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Jarak di tengah
            for (int j = 1; j <= 2 * (6 - i); j++) {
                System.out.print(" ");
            }

            // Bintang sebelah kanan
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
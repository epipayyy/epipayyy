public class Bagi3 {
    public static void main(String[] args) {
        int n_awal = 1;
        int n_akhir = 50;

        for (int i = n_awal; i <= n_akhir; i++) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
public class Bagi7 {
    public static void main(String[] args) {
        int n_awal = 1;
        int n_akhir = 50;

        for (int i = n_awal; i <= n_akhir; i++) {
            if (i % 7 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
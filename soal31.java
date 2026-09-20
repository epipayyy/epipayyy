public class Bagi5 {
    public static void main(String[] args) {
        int n_awal = 1;
        int n_akhir = 50;

        for (int i = n_awal; i <= n_akhir; i++) {
            if (i % 5 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
public class Kabisat8 {
    public static void main(String[] args) {
        int n_awal = 1900;
        int n_akhir = 2025;

        for (int tahun = n_awal; tahun <= n_akhir; tahun++) {
            if (tahun % 10 == 8 && (tahun % 400 == 0 || tahun % 4 == 0 && tahun % 100 != 0)) {
                System.out.print(tahun + " ");
            }
        }
    }
}
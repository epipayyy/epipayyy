public class TotalGanjil {
    public static void main(String[] args) {
        int n_awal = 1;
        int n_akhir = 50;
        int total = 0;

        for (int i = n_awal; i <= n_akhir; i++) {
            if (i % 2 != 0) {
                total = total + i;
            }
        }

        System.out.println("Total bilangan ganjil = " + total);
    }
}
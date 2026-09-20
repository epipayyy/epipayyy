public class JumlahPrima {
    public static void main(String[] args) {
        int n_awal = 1;
        int n_akhir = 50;
        int jumlahPrima = 0;

        for (int i = n_awal; i <= n_akhir; i++) {
            int jumlahFaktor = 0;

            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    jumlahFaktor++;
                }
            }

            if (jumlahFaktor == 2) {
                jumlahPrima++;
            }
        }

        System.out.println("Jumlah bilangan prima = " + jumlahPrima);
    }
}
public class Faktorial {
    public static void main(String[] args) {
        int n = 3;
        int hasil = 1;

        System.out.print(n + "! = ");

        for (int i = n; i >= 1; i--) {
            System.out.print(i);

            if (i > 1) {
                System.out.print(" x ");
            }

            hasil = hasil * i;
        }

        System.out.println(" = " + hasil);
    }
}
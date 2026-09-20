public class Fibonacci {
    public static void main(String[] args) {
        int maksimum = 34;
        int a = 0;
        int b = 1;

        while (a <= maksimum) {
            System.out.print(a);

            if (a + b <= maksimum) {
                System.out.print(", ");
            }

            int c = a + b;
            a = b;
            b = c;
        }
    }
}
public class Soal8 {
    public static void main(String[] args) {

        for (int angka = 1; angka <= 6; angka++) {
            if (angka == 1) {
                System.out.print("1");
            } else if (angka == 2) {
                System.out.print("12");
            } else if (angka == 3) {
                for (int i = 1; i <= 3; i++) {
                    System.out.print(3);
                }
            } else if (angka == 4) {
                System.out.print("1234");
            } else if (angka == 5) {
                for (int i = 1; i <= 5; i++) {
                    System.out.print(5);
                }
            } else {
                System.out.print("123456");
            }
        }

        System.out.println();
    }
}
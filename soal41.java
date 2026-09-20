public class Animasi41 {
    public static void main(String[] args) throws InterruptedException {

        for (int i = 0; i < 10; i++) {
            System.out.print("\033[H\033[2J");
            System.out.flush();

            for (int j = 0; j < i; j++) {
                System.out.println();
            }

            System.out.println("                              0");
            Thread.sleep(200);
        }

        for (int i = 9; i >= 0; i--) {
            System.out.print("\033[H\033[2J");
            System.out.flush();

            for (int j = 0; j < i; j++) {
                System.out.println();
            }

            System.out.println("                              0");
            Thread.sleep(200);
        }
    }
}
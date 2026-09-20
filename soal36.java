public class Animasi36 {
    public static void main(String[] args) throws InterruptedException {

        for (int i = 0; i < 30; i++) {
            System.out.print("\033[H\033[2J");
            System.out.flush();

            System.out.println();
            System.out.println();
            System.out.println(" ".repeat(i) + "0");

            Thread.sleep(100);
        }

        for (int i = 29; i >= 0; i--) {
            System.out.print("\033[H\033[2J");
            System.out.flush();

            System.out.println();
            System.out.println();
            System.out.println(" ".repeat(i) + "0");

            Thread.sleep(100);
        }

        for (int i = 0; i < 30; i++) {
            System.out.print("\033[H\033[2J");
            System.out.flush();

            System.out.println();
            System.out.println();
            System.out.println(" ".repeat(i) + "0");

            Thread.sleep(100);
        }
    }
}
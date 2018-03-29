import java.util.Random;

/**
 * Programmed by Joey Ferguson
 * 29 March 2018
 */

public class PiApproximation {

    private static double calculatePI(int N) {
        int total = 0;
        int insideCircle = 0;
        double pi;

        double r = 0.5;
        Random rand = new Random();
        for (int i = 0; i < N; i++) {
            double x = rand.nextDouble();
            double y = rand.nextDouble();

            double distance = (x * x) + (y * y);
            if (distance < (r * r)) {
                insideCircle++;
            }

            total++;
        }
        pi = 16 * ((double)insideCircle / (double)total);
        return pi;
    }

    public static void main(String[] args) {
        System.out.println("          100 points: " + calculatePI(100));
        System.out.println("        1,000 points: " + calculatePI(1000));
        System.out.println("       10,000 points: " + calculatePI(10000));
        System.out.println("      100,000 points: " + calculatePI(100000));
        System.out.println("    1,000,000 points: " + calculatePI(1000000));
        System.out.println("   10,000,000 points: " + calculatePI(10000000));
        System.out.println("  100,000,000 points: " + calculatePI(100000000));
        System.out.println("1,000,000,000 points: " + calculatePI(1000000000));
    }
}

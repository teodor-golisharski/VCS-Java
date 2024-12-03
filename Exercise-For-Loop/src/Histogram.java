import java.util.Arrays;
import java.util.Scanner;

public class Histogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] p = new int[5];
        Arrays.fill(p, 0);

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(scanner.nextLine());

            if (num >= 800) {
                p[4]++;
            } else if (num >= 600) {
                p[3]++;
            } else if (num >= 400) {
                p[2]++;
            } else if (num >= 200) {
                p[1]++;
            } else {
                p[0]++;
            }
        }

        for (int gr : p) {
            System.out.printf("%.2f%%%n", (double)gr/n * 100);
        }
    }
}

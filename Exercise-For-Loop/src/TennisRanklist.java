import java.util.Scanner;

public class TennisRanklist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int startingPoints = Integer.parseInt(scanner.nextLine());

        int pointsAcquired = startingPoints;

        double count = 0;
        for (int i = 0; i < n; i++) {
            String state = scanner.nextLine();

            switch (state) {
                case "W" -> {
                    pointsAcquired += 2000;
                    count++;
                }
                case "F" -> pointsAcquired += 1200;
                case "SF" -> pointsAcquired += 720;
            }
        }
        int temp = (int) Math.floor((double) ((pointsAcquired - startingPoints) / n));
        System.out.printf("Final points: %d%n", pointsAcquired);
        System.out.printf("Average points: %d%n", temp);
        System.out.printf("%.2f%%%n", count / n * 100);
    }
}

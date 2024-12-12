import java.util.Scanner;

public class Balls {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // red, orange, yellow, white, black, OTHER
        int[] balls = new int[6];
        int sum = 0;

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String color = scanner.nextLine();
            switch (color) {
                case "red" -> {
                    balls[0]++;
                    sum += 5;
                }
                case "orange" -> {
                    balls[1]++;
                    sum += 10;
                }
                case "yellow" -> {
                    balls[2]++;
                    sum += 15;
                }
                case "white" -> {
                    balls[3]++;
                    sum += 20;
                }
                case "black" -> {
                    balls[4]++;
                    sum /= 2;
                }
                default -> balls[5]++;
            }
        }
        System.out.printf("Total points: %d%n", sum);
        System.out.printf("Red balls: %d%n", balls[0]);
        System.out.printf("Orange balls: %d%n", balls[1]);
        System.out.printf("Yellow balls: %d%n", balls[2]);
        System.out.printf("White balls: %d%n", balls[3]);
        System.out.printf("Other colors picked: %d%n", balls[5]);
        System.out.printf("Divides from black balls: %d", balls[4]);
    }
}

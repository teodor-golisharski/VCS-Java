import java.util.Scanner;

public class BonusScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int points = Integer.parseInt(scanner.nextLine());
        double bonusPoints = points <= 100 ? 5 : points <= 1000 ? points * 0.2 : points * 0.1;
        bonusPoints += points % 2 == 0 ? 1 : 0;
        bonusPoints += points % 10 == 5 ? 2 : 0;

        System.out.printf("%.1f%n", bonusPoints);
        System.out.printf("%.1f", points + bonusPoints);
    }
}

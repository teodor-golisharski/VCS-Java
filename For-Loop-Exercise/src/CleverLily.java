import java.util.Scanner;

public class CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double price = Double.parseDouble(scanner.nextLine());
        int toyPrice = Integer.parseInt(scanner.nextLine());

        double budget = 0;
        int money = 10;
        int toysCount = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                budget += money - 1;
                money += 10;
            } else {
                toysCount++;
            }
        }

        budget += (toysCount * toyPrice);
        if (budget >= price) {
            System.out.printf("Yes! %.2f", budget - price);
        }
        else{
            System.out.printf("No! %.2f", price - budget);
        }
    }
}

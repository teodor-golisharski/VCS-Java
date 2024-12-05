import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double target = Double.parseDouble(scanner.nextLine());
        double balance = Double.parseDouble(scanner.nextLine());

        int daysSpend = 0;
        int daysCount = 0;

        while (balance < target) {
            String action = scanner.nextLine();
            double sum = Double.parseDouble(scanner.nextLine());

            daysCount++;
            switch (action) {
                case "spend" -> {
                    daysSpend++;
                    balance -= sum;
                    balance = balance < 0 ? 0 : balance;
                }
                case "save" -> {
                    balance += sum;
                    daysSpend = 0;
                }
            }

            if (daysSpend == 5) {
                System.out.println("You can't save the money.");
                System.out.println(daysCount);
                return;
            }
        }
        System.out.printf("You saved the money for %d days.", daysCount);
    }
}

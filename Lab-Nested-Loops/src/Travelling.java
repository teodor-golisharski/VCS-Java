import java.util.Scanner;

public class Travelling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        while (!input.equals("End")) {
            double budgetNeeded = Double.parseDouble(scanner.nextLine());
            double sum = 0;
            while (true) {
                double temp = Double.parseDouble(scanner.nextLine());
                sum += temp;
                if (sum >= budgetNeeded) {
                    System.out.printf("Going to %s!%n", input);
                    break;
                }
            }
            input = scanner.nextLine();
        }
    }
}

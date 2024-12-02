import java.util.Scanner;

public class AccountBalance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sum = 0;
        String input = scanner.nextLine();

        while (!input.equals("NoMoreMoney")) {
            double temp = Double.parseDouble(input);
            if (temp > 0) {
                sum += temp;
                System.out.printf("Increase: %.2f%n", temp);
            } else {
                System.out.println("Invalid operation!");
                break;
            }
            input = scanner.nextLine();
        }

        System.out.printf("Total: %.2f", sum);
    }
}

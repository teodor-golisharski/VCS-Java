import java.util.Scanner;

public class ChangeBureau {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int bitcoinsCount = Integer.parseInt(scanner.nextLine());
        double chineseCount = Double.parseDouble(scanner.nextLine());
        double commission = Double.parseDouble(scanner.nextLine());

        double balance = bitcoinsCount * 1168 / 1.95 + chineseCount * 0.15 * 1.76 / 1.95;
        balance -= balance * commission / 100;

        System.out.printf("%.2f", balance);
    }
}

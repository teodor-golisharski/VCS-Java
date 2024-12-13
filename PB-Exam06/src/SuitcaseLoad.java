import java.util.Scanner;

public class SuitcaseLoad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double trunkCapacity = Double.parseDouble(scanner.nextLine());
        String input = scanner.nextLine();
        int counter = 1;
        boolean success = true;

        while (!input.equals("End")) {
            double suitcase = Double.parseDouble(input);

            if (counter % 3 == 0) {
                suitcase *= 1.10;
            }

            trunkCapacity -= suitcase;
            if (trunkCapacity <= 0) {
                success = false;
                break;
            }
            counter++;

            input = scanner.nextLine();
        }

        if (success) {
            System.out.println("Congratulations! All suitcases are loaded!");
        } else {
            System.out.println("No more space!");
        }
        System.out.printf("Statistic: %d suitcases loaded.", counter - 1);
    }
}

import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int gpus = Integer.parseInt(scanner.nextLine());
        int cpus = Integer.parseInt(scanner.nextLine());
        int rams = Integer.parseInt(scanner.nextLine());

        double sum = (gpus * 250) * (1 + cpus * 0.35 + 0.1 * rams);
        sum -= gpus > cpus ? sum * 0.15 : 0;

        if (budget >= sum) {
            System.out.printf("You have %.2f leva left!", budget - sum);
        } else {
            System.out.printf("Not enough money! You need %.2f leva more!", Math.floor((sum - budget) * 100) / 100);
        }
    }
}

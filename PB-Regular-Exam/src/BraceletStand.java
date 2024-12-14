import java.util.Scanner;

public class BraceletStand {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double pocket = Double.parseDouble(scanner.nextLine());
        double salesProfit = Double.parseDouble(scanner.nextLine());
        double expenses = Double.parseDouble(scanner.nextLine());
        double presentPrice = Double.parseDouble(scanner.nextLine());

        double budget = pocket * 5 + salesProfit * 5 - expenses;
        if (budget >= presentPrice) {
            System.out.printf("Profit: %.2f BGN, the gift has been purchased.", budget);
        }
        else{
            System.out.printf("Insufficient money: %.2f BGN.", presentPrice - budget);
        }
    }
}

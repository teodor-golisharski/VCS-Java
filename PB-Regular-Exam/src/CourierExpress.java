import java.util.Scanner;

public class CourierExpress {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double weight = Double.parseDouble(scanner.nextLine());
        String serviceType = scanner.nextLine();
        int distance = Integer.parseInt(scanner.nextLine());

        double pricePerKm = 0.0;
        if (weight < 1) {
            pricePerKm = 0.03;
        } else if (weight < 10) {
            pricePerKm = 0.05;
        } else if (weight < 40) {
            pricePerKm = 0.10;
        } else if (weight < 90) {
            pricePerKm = 0.15;
        } else if (weight <= 150) {
            pricePerKm = 0.20;
        }

        double baseCost = pricePerKm * distance;

        double additionalCost = 0.0;
        if (serviceType.equals("express")) {
            double surchargePerKm = 0.0;
            if (weight < 1) {
                surchargePerKm = 0.8 * pricePerKm;
            } else if (weight < 10) {
                surchargePerKm = 0.4 * pricePerKm;
            } else if (weight < 40) {
                surchargePerKm = 0.05 * pricePerKm;
            } else if (weight < 90) {
                surchargePerKm = 0.02 * pricePerKm;
            } else if (weight <= 150) {
                surchargePerKm = 0.01 * pricePerKm;
            }

            additionalCost = surchargePerKm * weight * distance;
        }
        double totalCost = baseCost + additionalCost;

        System.out.printf("The delivery of your shipment with weight of %.3f kg. would cost %.2f lv.%n", weight, totalCost);
    }
}

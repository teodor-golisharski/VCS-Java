import java.util.Scanner;

public class SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        String roomType = scanner.nextLine();
        String rate  = scanner.nextLine();
        days--;

        double price = days;

        switch (roomType) {
            case "room for one person" -> price *= 18.00;
            case "apartment" -> price *= 25.00 * (days > 15 ? 0.5 : days >= 10 ? 0.65 : 0.7);
            case "president apartment" -> price *= 35.00 * (days > 15 ? 0.8 : days >= 10 ? 0.85 : 0.9);
        }

        price *= (rate.equals("positive") ? 1.25 : 0.9);

        System.out.printf("%.2f", price);
    }
}

import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int days = Integer.parseInt(scanner.nextLine());

        double studio = days;
        double apartment = days;

        switch (month) {
            case "May", "October" -> {
                studio *= (50.00 * (days > 14 ? 0.7 : days > 7 ? 0.95 : 1));
                apartment *= 65.00;
            }
            case "June", "September" -> {
                studio *= (75.20 * (days > 14 ? 0.8 : 1));
                apartment *= 68.70;
            }
            case "July", "August" -> {
                studio *= 76.00;
                apartment *= 77.00;
            }
        }
        apartment *= (days > 14 ? 0.9 : 1);

        System.out.printf("Apartment: %.2f lv.%n", apartment);
        System.out.printf("Studio: %.2f lv.", studio);
    }
}

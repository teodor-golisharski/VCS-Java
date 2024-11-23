import java.util.Scanner;

public class FruitShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        String day = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());

        double res = 0;

        switch (day) {
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> {
                switch (product) {
                    case "banana" -> res = 2.50;
                    case "apple" -> res = 1.20;
                    case "orange" -> res = 0.85;
                    case "grapefruit" -> res = 1.45;
                    case "kiwi" -> res = 2.70;
                    case "pineapple" -> res = 5.50;
                    case "grapes" -> res = 3.85;
                    default -> res = -1;
                }
            }
            case "Saturday", "Sunday" -> {
                switch (product) {
                    case "banana" -> res = 2.70;
                    case "apple" -> res = 1.25;
                    case "orange" -> res = 0.90;
                    case "grapefruit" -> res = 1.60;
                    case "kiwi" -> res = 3.00;
                    case "pineapple" -> res = 5.60;
                    case "grapes" -> res = 4.20;
                    default -> res = -1;
                }
            }
            default -> res = -1;
        }
        if (res != -1) {
            System.out.printf("%.2f", res * quantity);
        }
        else{
            System.out.println("error");
        }
    }
}

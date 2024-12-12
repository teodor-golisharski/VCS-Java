import java.util.Scanner;

public class AddBags {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double additionalPrice = Double.parseDouble(scanner.nextLine());
        double luggageWeight = Double.parseDouble(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());
        int count = Integer.parseInt(scanner.nextLine());

        double price = luggageWeight < 10 ? additionalPrice * 0.2 : luggageWeight <= 20 ? additionalPrice * 0.5 : additionalPrice;
        price *= days < 7 ? 1.4 : days <= 30 ? 1.15 : 1.10;

        System.out.printf("The total price of bags is: %.2f lv.", price * count);
    }
}

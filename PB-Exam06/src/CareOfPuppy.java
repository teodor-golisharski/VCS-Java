import java.util.Scanner;

public class CareOfPuppy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dogFoodPurchased = Integer.parseInt(scanner.nextLine()) * 1000;
        String input = scanner.nextLine();

        while (!input.equals("Adopted")) {
            int foodEaten = Integer.parseInt(input);
            dogFoodPurchased -= foodEaten;

            input = scanner.nextLine();
        }

        if (dogFoodPurchased >= 0) {
            System.out.printf("Food is enough! Leftovers: %d grams.", dogFoodPurchased);
        } else {
            System.out.printf("Food is not enough. You need %d grams more.", Math.abs(dogFoodPurchased));
        }
    }
}

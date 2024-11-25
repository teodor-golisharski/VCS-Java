import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String flowerType = scanner.nextLine();
        int flowerCount = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        double finalPrice = 0.0;

        if (flowerType.equals("Roses")) {
            finalPrice = 5 * flowerCount * (flowerCount > 80 ? 0.9 : 1);
        }
        else if (flowerType.equals("Dahlias")) {
            finalPrice = 3.80 * flowerCount * (flowerCount > 90 ? 0.85 : 1);
        }
        else if (flowerType.equals("Tulips")) {
            finalPrice = 2.80 * flowerCount * (flowerCount > 80 ? 0.85 : 1);
        }
        else if (flowerType.equals("Narcissus")) {
            finalPrice = 3 * flowerCount * (flowerCount < 120 ? 1.15 : 1);
        }
        else if (flowerType.equals("Gladiolus")) {
            finalPrice = 2.50 * flowerCount * (flowerCount < 80 ? 1.20 : 1);
        }

        if(budget >= finalPrice){
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.",
                    flowerCount, flowerType, (double) budget - finalPrice);
        }
        else{
            System.out.printf("Not enough money, you need %.2f leva more.", finalPrice - budget);
        }
    }
}

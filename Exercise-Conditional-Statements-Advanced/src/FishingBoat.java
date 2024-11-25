import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int fishersCount = Integer.parseInt(scanner.nextLine());

        double price = 0.0;
        switch (season) {
            case "Spring" -> price = 3000;
            case "Summer", "Autumn" -> price = 4200;
            case "Winter" -> price = 2600;
        }

        price *= fishersCount >= 12 ? 0.75 : fishersCount >= 7 ? 0.85 : 0.90;
        price *= fishersCount % 2 == 0 && !season.equals("Autumn") ? 0.95 : 1;

        if(budget >= price){
            System.out.printf("Yes! You have %.2f leva left.", (double)budget - price);
        }
        else{
            System.out.printf("Not enough money! You need %.2f leva.", price - budget);
        }
    }
}

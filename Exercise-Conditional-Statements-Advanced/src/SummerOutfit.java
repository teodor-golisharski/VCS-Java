import java.util.Scanner;

public class SummerOutfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int temperature = Integer.parseInt(scanner.nextLine());
        String dayTime = scanner.nextLine();

        String outfit = "";
        String shoes = "";

        switch (dayTime) {
            case "Morning" -> {
                if (temperature >= 25) {
                    outfit = "T-Shirt";
                    shoes = "Sandals";
                } else if (temperature >= 19) {
                    outfit = "Shirt";
                    shoes = "Moccasins";
                } else {
                    outfit = "Sweatshirt";
                    shoes = "Sneakers";
                }
            }
            case "Afternoon" -> {
                if (temperature >= 25) {
                    outfit = "Swim Suit";
                    shoes = "Barefoot";
                } else if (temperature >= 19) {
                    outfit = "T-Shirt";
                    shoes = "Sandals";
                } else {
                    outfit = "Shirt";
                    shoes = "Moccasins";
                }
            }
            case "Evening" -> {
                outfit = "Shirt";
                shoes = "Moccasins";
            }
        }

        System.out.printf("It's %d degrees, get your %s and %s.", temperature, outfit, shoes);
    }
}

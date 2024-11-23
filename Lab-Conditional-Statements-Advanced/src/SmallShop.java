import java.util.Scanner;

public class SmallShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        String town = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());

        double res = 0;

        switch (town){
            case "Sofia" -> {
                switch (product){
                    case "coffee" -> res = 0.50;
                    case "water" -> res = 0.80;
                    case "beer" -> res = 1.20;
                    case "sweets" -> res = 1.45;
                    case "peanuts" -> res = 1.60;
                }
            }
            case "Plovdiv" -> {
                switch (product){
                    case "coffee" -> res = 0.40;
                    case "water" -> res = 0.70;
                    case "beer" -> res = 1.15;
                    case "sweets" -> res = 1.30;
                    case "peanuts" -> res = 1.50;
                }
            }
            case "Varna" -> {
                switch (product){
                    case "coffee" -> res = 0.45;
                    case "water" -> res = 0.70;
                    case "beer" -> res = 1.10;
                    case "sweets" -> res = 1.35;
                    case "peanuts" -> res = 1.55;
                }
            }
        }
        System.out.println(res * quantity);
    }
}

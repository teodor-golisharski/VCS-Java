import java.util.Scanner;

public class GodzillaVsKong {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int stats = Integer.parseInt(scanner.nextLine());
        double price = Double.parseDouble(scanner.nextLine());

        budget *= 0.9;
        price = stats > 150 ? price * 0.9 : price;
        budget -= stats * price;

        if(budget < 0){
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", Math.abs(budget));
        }
        else{
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", Math.abs(budget));
        }
    }
}

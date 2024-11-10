import java.util.Scanner;

public class FoodDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int chickenMenus = Integer.parseInt(scanner.nextLine());
        int fishMenus = Integer.parseInt(scanner.nextLine());
        int veggieMenus = Integer.parseInt(scanner.nextLine());

        double sum = (chickenMenus * 10.35 + fishMenus * 12.40 + veggieMenus * 8.15) * 1.20 + 2.50;
        System.out.println(sum);
    }
}

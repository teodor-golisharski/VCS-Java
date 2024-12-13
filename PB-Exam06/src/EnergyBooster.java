import java.util.Scanner;

public class EnergyBooster {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fruit = scanner.nextLine();
        boolean size = scanner.nextLine().equals("big"); // 0-small 1-big

        double price = Integer.parseInt(scanner.nextLine());

        switch (fruit){
            case "Watermelon" ->  price *= size ? 5 * 28.70 : 2 * 56;
            case "Mango" ->  price *= size ? 5 * 19.60 : 2 * 36.66;
            case "Pineapple" ->  price *= size ? 5 * 24.80 : 2 * 42.10;
            case "Raspberry" ->  price *= size ? 5 * 15.20 : 2 * 20;
        }

        price *= price > 1000 ? 0.5 : price >= 400 ? 0.85 : 1;
        System.out.printf("%.2f lv.", price);
    }
}

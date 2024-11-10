import java.util.Scanner;

public class BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int yearlyTax = Integer.parseInt(scanner.nextLine());
        double shoes = yearlyTax * 0.60;
        double jersey = shoes * 0.80;
        double ball = jersey * 0.25;
        double accessories = ball * 0.20;

        double sum = yearlyTax + shoes + jersey + ball + accessories;
        System.out.println(sum);
    }
}

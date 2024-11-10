import java.util.Scanner;

public class Repainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nylon = Integer.parseInt(scanner.nextLine());
        int paint = Integer.parseInt(scanner.nextLine());
        int thinner = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());

        double materialPrice = ((nylon + 2) * 1.50) + (paint * 1.10 * 14.50) + (thinner * 5.00) + 0.4;
        double laborPrice = (materialPrice * 0.30) * hours;
        System.out.println(materialPrice + laborPrice);
    }
}

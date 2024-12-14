import java.util.Scanner;

public class GrandpaStavri {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double quantity = 0.0;
        double degrees = 0.0;

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            double rakia = Double.parseDouble(scanner.nextLine());
            double degree = Double.parseDouble(scanner.nextLine());

            quantity += rakia;
            degrees += rakia * degree;
        }

        degrees /= quantity;

        System.out.printf("Liter: %.2f%n", quantity);
        System.out.printf("Degrees: %.2f%n", degrees);
        if (degrees < 38) {
            System.out.println("Not good, you should baking!");
        } else if (degrees <= 42) {
            System.out.println("Super!");
        } else {
            System.out.println("Dilution with distilled water!");
        }
    }
}

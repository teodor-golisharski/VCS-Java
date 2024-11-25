import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();
        int rows = Integer.parseInt(scanner.nextLine());
        int columns = Integer.parseInt(scanner.nextLine());

        double price = rows * columns;
        price *= type.equals("Premiere") ? 12.00 : type.equals("Normal") ? 7.50 : 5.00;

        System.out.printf("%.2f", price);
    }
}
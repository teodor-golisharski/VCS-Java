import java.util.Scanner;

public class PCStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double cpuPrice = Double.parseDouble(scanner.nextLine());
        double gpuPrice = Double.parseDouble(scanner.nextLine());
        double ramPrice = Double.parseDouble(scanner.nextLine());

        int ramCount = Integer.parseInt(scanner.nextLine());
        double discount = Double.parseDouble(scanner.nextLine());

        double price = (cpuPrice + gpuPrice) * (1 - discount) + ramPrice * ramCount;
        price *= 1.57;

        System.out.printf("Money needed - %.2f leva.", price);
    }
}
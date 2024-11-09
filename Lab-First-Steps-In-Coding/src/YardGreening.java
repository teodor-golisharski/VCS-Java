import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double area = Double.parseDouble(scanner.nextLine());

        double regularPrice = area * 7.61;
        double discount = regularPrice * 0.18;

        System.out.printf("The final price is: %.2f lv.", regularPrice-discount);
        System.out.printf("The discount is: %.2f lv.", discount);
    }
}

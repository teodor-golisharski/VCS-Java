import java.util.Scanner;

public class InchConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double input = Double.parseDouble(scanner.nextLine());
        System.out.println(input * 2.54);
    }
}

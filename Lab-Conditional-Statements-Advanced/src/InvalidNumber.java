import java.util.Scanner;

public class InvalidNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());
        boolean valid = (input >= 100 && input <= 200) || input == 0;

        if (!valid) {
            System.out.println("invalid");
        }
    }
}

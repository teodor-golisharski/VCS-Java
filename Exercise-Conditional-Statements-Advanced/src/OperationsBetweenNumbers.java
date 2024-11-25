import java.util.Scanner;

public class OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        char operator = scanner.nextLine().charAt(0);

        int result = 0;
        switch (operator) {
            case '+' -> result = a + b;
            case '-' -> result = a - b;
            case '*' -> result = a * b;
            case '/' -> {
                if (b == 0) {
                    System.out.printf("Cannot divide %d by zero", a);
                } else {
                    System.out.printf("%d %s %d = %.2f", a, operator, b, (double) a / b);
                }
                return;
            }
            case '%' -> {
                if (b == 0) {
                    System.out.printf("Cannot divide %d by zero", a);
                } else {
                    System.out.printf("%d %s %d = %d", a, operator, b, a % b);
                }
                return;
            }
        }
        System.out.printf("%d %s %d = %d - %s", a, operator, b, result, (result % 2 == 0) ? "even" : "odd");
    }
}

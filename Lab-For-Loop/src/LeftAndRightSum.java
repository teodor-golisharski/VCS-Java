import java.util.Scanner;

public class LeftAndRightSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int left = 0;
        int right = 0;

        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            left += number;
        }

        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            right += number;
        }

        if (left == right) {
            System.out.println("Yes, sum = " + left);
        } else {
            int diff = Math.abs(left - right);
            System.out.println("No, diff = " + diff);
        }
    }
}

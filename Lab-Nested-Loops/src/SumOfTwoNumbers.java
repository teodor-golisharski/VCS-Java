import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = Integer.parseInt(scanner.nextLine());
        int y = Integer.parseInt(scanner.nextLine());
        int magic = Integer.parseInt(scanner.nextLine());

        int counter = 0;
        for (int i = x; i <= y; i++) {
            for (int j = x; j <= y; j++) {
                counter++;
                if (i + j == magic) {
                    System.out.printf("Combination N:%d (%d + %d = %d)", counter, i, j, i + j);
                    return;
                }
            }
        }
        System.out.printf("%d combinations - neither equals %d", counter, magic);
    }
}

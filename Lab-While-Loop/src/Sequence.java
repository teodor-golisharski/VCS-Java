import java.util.Scanner;

public class Sequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int temp = 1;
        while (temp <= n) {
            System.out.println(temp);
            temp *= 2;
            temp++;
        }
    }
}

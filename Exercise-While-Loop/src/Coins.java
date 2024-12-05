import java.util.Scanner;

public class Coins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double change = scanner.nextDouble();
        int cents = (int) Math.round(change * 100);

        int[] coins = {200, 100, 50, 20, 10, 5, 2, 1};
        int count = 0;

        for (int coin : coins){
            while (cents >= coin){
                cents -= coin;
                count++;
            }
        }

        System.out.println(count);
    }
}

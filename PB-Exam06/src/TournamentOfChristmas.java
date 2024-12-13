import java.util.Scanner;

public class TournamentOfChristmas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());

        int daysWon = 0;
        double balance = 0.0;

        for (int i = 0; i < days; i++) {
            int wins = 0;
            int loses = 0;

            double dayWinnings = 0.0;

            String input = scanner.nextLine();
            while (!input.equals("Finish")) {
                boolean result = scanner.nextLine().equals("win");

                if (result) {
                    wins++;
                    dayWinnings += 20;
                }
                else{
                    loses++;
                }
                input = scanner.nextLine();
            }

            if (wins > loses) {
                dayWinnings *= 1.10;
                daysWon++;
            }
            balance += dayWinnings;
        }

        if (daysWon > days - daysWon) {
            balance *= 1.2;
            System.out.printf("You won the tournament! Total raised money: %.2f", balance);
        }
        else{
            System.out.printf("You lost the tournament! Total raised money: %.2f", balance);
        }
    }
}

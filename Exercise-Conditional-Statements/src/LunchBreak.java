import java.util.Scanner;

public class LunchBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String seriesName = scanner.nextLine();
        int episodeDuration = Integer.parseInt(scanner.nextLine());
        int breakDuration = Integer.parseInt(scanner.nextLine());

        double lunch = (double) breakDuration / 8;
        double relax = (double) breakDuration / 4;

        double timeForRest = episodeDuration + lunch + relax;

        if (breakDuration < timeForRest) {
            System.out.printf("You don't have enough time to watch %s, you need %d more minutes.",
                    seriesName,
                    (int)Math.ceil(timeForRest - breakDuration));
        }
        else{
            System.out.printf("You have enough time to watch %s and left with %d minutes free time.",
                    seriesName,
                    (int)Math.ceil(breakDuration - timeForRest));
        }
    }
}

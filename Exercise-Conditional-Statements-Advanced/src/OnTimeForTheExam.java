import java.time.Duration;
import java.time.LocalTime;
import java.util.Scanner;

public class OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int examHours = Integer.parseInt(scanner.nextLine());
        int examMinutes = Integer.parseInt(scanner.nextLine());
        int arrivalHours = Integer.parseInt(scanner.nextLine());
        int arrivalMinutes = Integer.parseInt(scanner.nextLine());

        LocalTime examTime = LocalTime.of(examHours, examMinutes);
        LocalTime arrivalTime = LocalTime.of(arrivalHours, arrivalMinutes);

        Duration duration = Duration.between(arrivalTime, examTime);
        long totalMinutes = duration.toMinutes();

        if (totalMinutes < 0) {
            System.out.println("Late");
            printTimeDifference(-totalMinutes, "after the start");
        } else if (totalMinutes <= 30) {
            System.out.println("On time");
            if (totalMinutes > 0) {
                printTimeDifference(totalMinutes, "before the start");
            }
        } else {
            System.out.println("Early");
            printTimeDifference(totalMinutes, "before the start");
        }

    }

    private static void printTimeDifference(long totalMinutes, String suffix) {
        long hours = totalMinutes / 60;
        long minutes = totalMinutes % 60;
        if (hours > 0) {
            System.out.printf("%d:%02d hours %s%n", hours, minutes, suffix);
        } else {
            System.out.printf("%d minutes %s%n", minutes, suffix);
        }
    }
}

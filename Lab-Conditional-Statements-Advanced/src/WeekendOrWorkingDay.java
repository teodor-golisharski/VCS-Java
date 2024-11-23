import java.util.Scanner;

public class WeekendOrWorkingDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String day = scanner.nextLine();
        String result = switch (day) {
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> "Working day";
            case "Saturday", "Sunday" -> "Weekend";

            default -> "Error";
        };

        System.out.println(result);
    }
}

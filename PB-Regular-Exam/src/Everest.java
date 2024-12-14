import java.util.Scanner;

public class Everest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int currentAltitude = 5364;
        int days = 1;

        String input = scanner.nextLine();
        while (!input.equals("END")) {
            boolean rest = input.equals("Yes");
            int meters = Integer.parseInt(scanner.nextLine());

            if (rest) {
                days++;
            }
            if(days > 5){
                break;
            }
            currentAltitude += meters;

            if(currentAltitude >= 8848){
                System.out.printf("Goal reached for %d days!", days);
                return;
            }

            input = scanner.nextLine();
        }

        System.out.println("Failed!");
        System.out.println(currentAltitude);
    }
}

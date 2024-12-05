import java.util.Scanner;

public class Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int stepsCounter = 0;
        boolean status = false;

        String input = scanner.nextLine();
        while (!input.equals("Going home")) {
            int stepsTaken = Integer.parseInt(input);
            stepsCounter += stepsTaken;

            if (stepsCounter >= 10000) {
                status = true;
                break;
            }
            input = scanner.nextLine();
        }
        if (!status) {
            int stepsToHome = Integer.parseInt(scanner.nextLine());
            stepsCounter += stepsToHome;

            if (stepsCounter >= 10000) {
                status = true;
            }
        }

        if (status) {
            System.out.println("Goal reached! Good job!");
            System.out.printf("%d steps over the goal!", stepsCounter - 10000);
        } else {
            System.out.printf("%d more steps to reach goal.", 10000 - stepsCounter);
        }
    }
}

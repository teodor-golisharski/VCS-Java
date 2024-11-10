import java.util.Scanner;

public class SpeedInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double speed = Double.parseDouble(scanner.nextLine());

        System.out.println(speed <= 10 ? "slow" : speed <= 50 ? "average" : speed <= 150 ? "fast" : speed <= 1000 ? "ultra fast" : "extremely fast");
    }
}

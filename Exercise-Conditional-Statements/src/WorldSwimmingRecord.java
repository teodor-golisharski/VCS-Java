import java.util.Scanner;

public class WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double worldRecord = Double.parseDouble(scanner.nextLine());
        double distance = Double.parseDouble(scanner.nextLine());
        double time = Double.parseDouble(scanner.nextLine());

        double timeToSwim = distance * time;
        timeToSwim += Math.floor(distance / 15) * 12.5;

        if (timeToSwim >= worldRecord) {
            System.out.printf("No, he failed! He was %.2f seconds slower.", timeToSwim - worldRecord);
        } else {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", timeToSwim);
        }
    }
}

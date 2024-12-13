import java.util.Scanner;

public class MountainRun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double secRecord = Double.parseDouble(scanner.nextLine());
        double metRecord = Double.parseDouble(scanner.nextLine());
        double secondsClimbing = Double.parseDouble(scanner.nextLine());

        double time = metRecord * secondsClimbing;
        time += ((int)(metRecord / 50)) * 30;

        if(secRecord <= time){
            System.out.printf("No! He was %.2f seconds slower.", time - secRecord);
        }
        else{
            System.out.printf("Yes! The new record is %.2f seconds.", time);
        }
    }
}

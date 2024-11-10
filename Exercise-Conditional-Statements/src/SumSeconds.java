import java.util.Scanner;

public class SumSeconds {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int firstTime = Integer.parseInt(scanner.nextLine());
        int secondTime = Integer.parseInt(scanner.nextLine());
        int thirdTime = Integer.parseInt(scanner.nextLine());

        int totalTime = firstTime + secondTime + thirdTime;
        int hours = totalTime / 60;
        int minutes = totalTime % 60;

        if(minutes < 10){
            System.out.printf("%d:0%d", hours, minutes);
        }
        else{
            System.out.printf("%d:%d", hours, minutes);
        }
    }
}
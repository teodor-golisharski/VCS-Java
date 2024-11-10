import java.util.Scanner;

public class Time15Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        minutes += 15;
        hours += minutes >= 60 ? 1 : 0;
        hours = hours<=23 ? hours : 0;
        minutes = minutes >= 60 ? minutes - 60 : minutes;

        if(minutes < 10){
            System.out.printf("%d:0%d", hours, minutes);
        }
        else{
            System.out.printf("%d:%d", hours, minutes);
        }
    }
}

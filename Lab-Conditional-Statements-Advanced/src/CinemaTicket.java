import java.util.Scanner;

public class CinemaTicket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String day = scanner.nextLine();

        int price = 0;

        switch (day){
            case "Monday", "Tuesday", "Friday" -> price = 12;
            case "Wednesday", "Thursday" -> price = 14;
            case "Saturday", "Sunday" -> price = 16;
        }

        System.out.println(price);
    }
}

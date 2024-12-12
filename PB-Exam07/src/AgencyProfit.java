import java.util.Scanner;

public class AgencyProfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int adultsTicketsCount = Integer.parseInt(scanner.nextLine());
        int kidTicketsCount = Integer.parseInt(scanner.nextLine());
        double ticketPrice = Double.parseDouble(scanner.nextLine());
        double serviceFee = Double.parseDouble(scanner.nextLine());

        double kidTicket = ticketPrice * 0.3 + serviceFee;
        ticketPrice += serviceFee;

        double sum = adultsTicketsCount * ticketPrice + kidTicketsCount * kidTicket;

        System.out.printf("The profit of your agency from %s tickets is %.2f lv.", name, sum * 0.2);
    }
}
import java.util.Scanner;

public class CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int studentTickets = 0;
        int standardTickets = 0;
        int kidsTickets = 0;

        String input = scanner.nextLine();
        while (!input.equals("Finish")) {
            int availableSeats = Integer.parseInt(scanner.nextLine());
            boolean stop = false;

            int takenSeats = 0;
            while (availableSeats > takenSeats) {
                String ticket = scanner.nextLine();

                switch (ticket) {
                    case "standard" -> standardTickets++;
                    case "student" -> studentTickets++;
                    case "kid" -> kidsTickets++;
                    case "End" -> stop = true;
                }
                if (stop) {
                    break;
                } else {
                    takenSeats++;
                }
            }
            System.out.printf("%s - %.2f%% full.%n", input, (double) takenSeats / availableSeats * 100);
            input = scanner.nextLine();
        }

        int total = kidsTickets + standardTickets + studentTickets;
        System.out.printf("Total tickets: %d%n", total);
        System.out.printf("%.2f%% student tickets.%n", (double)studentTickets / total * 100);
        System.out.printf("%.2f%% standard tickets.%n", (double)standardTickets / total * 100);
        System.out.printf("%.2f%% kids tickets.", (double)kidsTickets / total * 100);
    }
}

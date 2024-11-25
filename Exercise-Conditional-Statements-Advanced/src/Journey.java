import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        if (budget > 1000) {
            System.out.println("Somewhere in Europe");
            System.out.printf("Hotel - %.2f", budget * 0.9);
        } else if (budget > 100) {
            System.out.println("Somewhere in Balkans");
            String accommodation = season.equals("summer") ? "Camp" : "Hotel";
            System.out.printf("%s - %.2f", accommodation, season.equals("summer") ? budget * 0.4 : budget * 0.8);
        }
        else{
            System.out.println("Somewhere in Bulgaria");
            String accommodation = season.equals("summer") ? "Camp" : "Hotel";
            System.out.printf("%s - %.2f", accommodation, season.equals("summer") ? budget * 0.3 : budget * 0.7);
        }
    }
}

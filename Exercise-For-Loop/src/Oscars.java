import java.util.Scanner;

public class Oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String actor = scanner.nextLine();
        double academyPoints = Double.parseDouble(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            double points = Double.parseDouble(scanner.nextLine());

            academyPoints += (input.length() * points) / 2;

            if(academyPoints > 1250.5){
                System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", actor, academyPoints);
                return;
            }
        }
        System.out.printf("Sorry, %s you need %.1f more!", actor, 1250.5 - academyPoints);

    }
}

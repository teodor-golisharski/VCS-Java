import java.util.Scanner;

public class BestPlayer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String bestPlayer = "";
        int score = 0;

        String name = scanner.nextLine();
        while (!name.equals("END")) {
            int goals = Integer.parseInt(scanner.nextLine());
            if (goals > score) {
                score = goals;
                bestPlayer = name;
            }
            if(goals >= 10){
                break;
            }

            name = scanner.nextLine();
        }

        System.out.printf("%s is the best player!%n", bestPlayer);
        if(score >= 3){
            System.out.printf("He has scored %d goals and made a hat-trick !!!", score);
        }
        else{
            System.out.printf("He has scored %d goals.", score);
        }
    }
}

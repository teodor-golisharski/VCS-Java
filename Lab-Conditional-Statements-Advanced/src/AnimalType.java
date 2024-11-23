import java.util.Scanner;

public class AnimalType {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String animal = scanner.nextLine();
        String result = switch (animal) {
            case "dog" -> "mammal";
            case "crocodile", "tortoise", "snake" -> "reptile";

            default -> "unknown";
        };

        System.out.println(result);
    }
}

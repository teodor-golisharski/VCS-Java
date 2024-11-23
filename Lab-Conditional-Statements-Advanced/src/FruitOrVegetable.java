import java.util.Scanner;

public class FruitOrVegetable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String output = "";

        switch (input){
            case "banana", "apple", "kiwi", "cherry", "lemon", "grapes" -> output = "fruit";
            case "tomato", "cucumber", "pepper", "carrot" -> output = "vegetable";
            default -> output = "unknown";
        }

        System.out.println(output);
    }
}

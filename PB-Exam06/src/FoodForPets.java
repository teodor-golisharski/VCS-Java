import java.util.Scanner;

public class FoodForPets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        double food = Double.parseDouble(scanner.nextLine());

        double dog = 0.0;
        double cat = 0.0;
        double biscuits = 0.0;

        for (int i = 1; i <= days; i++) {
            int dogFood = Integer.parseInt(scanner.nextLine());
            dog += dogFood;

            int catFood = Integer.parseInt(scanner.nextLine());
            cat += catFood;

            if (i % 3 == 0) {
                biscuits += (double)(catFood + dogFood) / 10;
            }
        }

        System.out.printf("Total eaten biscuits: %dgr.%n", Math.round(biscuits));
        System.out.printf("%.2f%% of the food has been eaten.%n", (dog + cat) / food * 100);
        System.out.printf("%.2f%% eaten from the dog.%n",  dog / (dog + cat) * 100);
        System.out.printf("%.2f%% eaten from the cat.",  cat / (dog + cat) * 100);
    }
}

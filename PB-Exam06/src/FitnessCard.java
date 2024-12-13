import java.util.Scanner;

public class FitnessCard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double balance = Double.parseDouble(scanner.nextLine());
        char gender = scanner.nextLine().charAt(0);
        int age = Integer.parseInt(scanner.nextLine());
        String sport = scanner.nextLine();

        double sum = 0.0;
        switch (sport){
            case "Gym" -> sum += gender == 'm' ? 42 : 35;
            case "Boxing" -> sum += gender == 'm' ? 41 : 37;
            case "Yoga" -> sum += gender == 'm' ? 45 : 42;
            case "Zumba" -> sum += gender == 'm' ? 34 : 31;
            case "Dances" -> sum += gender == 'm' ? 51 : 53;
            case "Pilates" -> sum += gender == 'm' ? 39 : 37;
        }
        sum *= age <= 19 ? 0.8 : 1;

        if(balance < sum){
            System.out.printf("You don't have enough money! You need $%.2f more.", sum - balance);
        }
        else{
            System.out.printf("You purchased a 1 month pass for %s.", sport);
        }
    }
}

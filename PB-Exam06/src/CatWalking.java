import java.util.Scanner;

public class CatWalking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int minutesWalking = Integer.parseInt(scanner.nextLine());
        int walksCount = Integer.parseInt(scanner.nextLine());
        int calories = Integer.parseInt(scanner.nextLine());

        int caloriesBurnt = walksCount * minutesWalking * 5;
        if(caloriesBurnt >= calories / 2){
            System.out.printf("Yes, the walk for your cat is enough. Burned calories per day: %d.", caloriesBurnt);
        }
        else{
            System.out.printf("No, the walk for your cat is not enough. Burned calories per day: %d.", caloriesBurnt);
        }
    }
}

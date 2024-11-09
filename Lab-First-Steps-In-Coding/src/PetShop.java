import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dogsPackaging = Integer.parseInt(scanner.nextLine());
        int catsPackaging = Integer.parseInt(scanner.nextLine());

        double result = dogsPackaging*2.5 + catsPackaging*4;

        System.out.printf("%.1f lv.", result);
    }
}

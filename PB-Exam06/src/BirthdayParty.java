import java.util.Scanner;

public class BirthdayParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double rentPrice = Double.parseDouble(scanner.nextLine());
        double cake = rentPrice * 0.2;
        double drinks = cake * 0.55;
        double entertainment = rentPrice / 3;

        System.out.printf("%.2f", rentPrice + cake + drinks + entertainment);
    }
}
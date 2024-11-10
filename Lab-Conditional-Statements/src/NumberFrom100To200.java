import java.util.Scanner;

public class NumberFrom100To200 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        System.out.println(number < 100 ? "Less than 100" : number <= 200 ? "Between 100 and 200" : "Greater than 200");
    }
}

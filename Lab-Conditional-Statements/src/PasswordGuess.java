import java.util.Scanner;

public class PasswordGuess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        System.out.println(text.equals("s3cr3t!P@ssw0rd") ? "Welcome" : "Wrong password!");
    }
}

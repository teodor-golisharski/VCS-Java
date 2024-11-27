import java.util.Scanner;

public class CharacterSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        for(char s : input.toCharArray()){
            System.out.println(s);
        }
    }
}

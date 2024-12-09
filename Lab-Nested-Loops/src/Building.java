import java.util.Scanner;

public class Building {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int floors = Integer.parseInt(scanner.nextLine());
        int rooms = Integer.parseInt(scanner.nextLine());

        for (int i = floors; i >= 1; i--) {
            char ch;
            if (i == floors) {
                ch = 'L';
            } else if (i % 2 == 0) {
                ch = 'O';
            } else {
                ch = 'A';
            }
            for (int j = 0; j < rooms; j++) {
                int num = i * 10 + j;
                System.out.print(ch + "" + num + " ");
            }
            System.out.println();
        }
    }
}

import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int badMarks = Integer.parseInt(scanner.nextLine());
        int badMarksCount = 0;

        double marks = 0.0;
        int count = 0;
        String lastProblem = "";

        String input = scanner.nextLine();
        while (!input.equals("Enough")) {
            int mark = Integer.parseInt(scanner.nextLine());
            if (mark <= 4) {
                badMarksCount++;
            }
            marks += mark;
            count++;
            lastProblem = input;

            if (badMarks == badMarksCount) {
                System.out.printf("You need a break, %d poor grades.", badMarks);
                return;
            }

            input = scanner.nextLine();
        }
        System.out.printf("Average score: %.2f%n", marks / count);
        System.out.printf("Number of problems: %d%n", count);
        System.out.printf("Last problem: %s", lastProblem);
    }
}

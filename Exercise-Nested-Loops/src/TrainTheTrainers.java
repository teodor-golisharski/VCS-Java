import java.util.Scanner;

public class TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double finalAssessment = 0.0;
        int assessmentCount = 0;

        String input = scanner.nextLine();
        while (!input.equals("Finish")) {
            double grades = 0.0;
            for (int i = 0; i < n; i++) {
                double grade = Double.parseDouble(scanner.nextLine());
                grades += grade;
            }
            finalAssessment += grades;
            assessmentCount += n;

            System.out.printf("%s - %.2f.%n", input, grades / n);

            input = scanner.nextLine();
        }
        System.out.printf("Student's final assessment is %.2f.", finalAssessment / assessmentCount);
    }
}

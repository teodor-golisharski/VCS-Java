import java.util.Scanner;

public class Graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sum = 0.0;
        int currentClass = 1;
        boolean flag = true;

        String name = scanner.nextLine();

        while (currentClass <= 12) {
            double grade = Double.parseDouble(scanner.nextLine());

            if (grade < 4.00) {
                if (flag) {
                    flag = false;
                } else {
                    System.out.printf("%s has been excluded at %d grade", name, currentClass);
                    return;
                }
            } else {
                currentClass++;
                sum += grade;
            }
        }
        System.out.printf("%s graduated. Average grade: %.2f", name, sum / 12);
    }
}

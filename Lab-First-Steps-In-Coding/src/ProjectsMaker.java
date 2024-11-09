import java.util.Scanner;

public class ProjectsMaker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int projectsNumber = Integer.parseInt(scanner.nextLine());

        System.out.printf("The architect %s will need %d hours to complete %d project/s.",
                name,
                projectsNumber * 3,
                projectsNumber);
    }
}

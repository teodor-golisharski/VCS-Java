import java.util.Scanner;

public class AreaOfFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String figure = scanner.nextLine();
        double size = Double.parseDouble(scanner.nextLine());

        double result = switch (figure) {
            case "square" -> size * size;
            case "rectangle" -> {
                double secondSize = Double.parseDouble(scanner.nextLine());
                yield size * secondSize;
            }
            case "circle" -> size * Math.PI * size;
            case "triangle" -> {
                double trSize = Double.parseDouble(scanner.nextLine());
                yield size * trSize / 2;
            }
            default -> 0;
        };
        System.out.printf("%.3f", result);
    }
}

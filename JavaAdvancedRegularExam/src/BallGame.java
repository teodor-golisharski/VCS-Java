
import java.util.*;
import java.util.stream.Collectors;

public class BallGame {

    private final static int REQUIRED_SUM = 100;
    private final static int DECREASING_VALUE = 10;
    private final static int ZERO = 0;

    public static void main(String[] args) {

        int goals = 0;

        Scanner scanner = new Scanner(System.in);

        Stack<Integer> strength = new Stack<>();
        Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .forEach(strength::push);

        Queue<Integer> accuracy = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(LinkedList::new));

        while (!strength.isEmpty() && !accuracy.isEmpty()) {
            int currentStrength = strength.peek();
            int currentAccuracy = Optional.ofNullable(accuracy.peek()).orElse(ZERO);
            int currentSum = currentStrength + currentAccuracy;

            if (currentSum == REQUIRED_SUM) {
                goals++;
                strength.pop();
                accuracy.poll();
            } else if (currentSum < REQUIRED_SUM) {
                if (currentStrength < currentAccuracy) {
                    strength.pop();

                } else if (currentStrength > currentAccuracy) {
                    accuracy.poll();
                } else {
                    int poppedStrength = strength.pop();
                    int polledAccuracy = Optional.ofNullable(accuracy.poll()).orElse(ZERO);
                    strength.push(poppedStrength + polledAccuracy);
                }
            } else {
                Optional.ofNullable(strength.pop())
                        .ifPresentOrElse(
                                value -> strength.push(value - DECREASING_VALUE),
                                () -> strength.push(ZERO));
                accuracy.offer(accuracy.poll());
            }
        }

        if (goals == 0) {
            System.out.println("Paul failed to score a single goal.");
        } else if (goals < 3) {
            System.out.println("Paul failed to make a hat-trick.");
        } else if (goals == 3) {
            System.out.println("Paul scored a hat-trick!");
        } else {
            System.out.println("Paul performed remarkably well!");
        }
        if (goals > 0) {
            System.out.println("Goals scored: " + goals);
        }


        if (!strength.isEmpty()) {
            System.out.println("Strength values left: " + strength.toString().replaceAll("[\\[\\]]", ""));
        }
        if (!accuracy.isEmpty()) {
            System.out.println("Accuracy values left: " + accuracy.toString().replaceAll("[\\[\\]]", ""));
        }

    }
}
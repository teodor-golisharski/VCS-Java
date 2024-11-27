import java.util.HashSet;
import java.util.Scanner;

public class NumberSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        HashSet<Integer> integerHashSet = new HashSet<>();
        for (int i = 0; i < n; i++) {
            integerHashSet.add(Integer.parseInt(scanner.nextLine()));
        }

        System.out.printf("Max number: %d%n", integerHashSet.stream().max(Integer::compare).orElse(null));
        System.out.printf("Min number: %d", integerHashSet.stream().min(Integer::compare).orElse(null));
    }
}

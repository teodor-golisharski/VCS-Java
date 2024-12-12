import java.util.Scanner;

public class BarcodeGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());

        String startSt = String.valueOf(start);
        String endSt = String.valueOf(end);

        int[] startArr = startSt.chars()
                .map(Character::getNumericValue)
                .toArray();

        int[] endArr = endSt.chars()
                .map(Character::getNumericValue)
                .toArray();

        for (int i = 0; i < 4; i++) {
            if (startArr[i] % 2 == 0) {
                startArr[i]++;
            }
            if (endArr[i] % 2 == 0) {
                endArr[i]--;
            }
        }

        for (int i = startArr[0]; i <= endArr[0]; i += 2) {
            for (int j = startArr[1]; j <= endArr[1]; j += 2) {
                for (int k = startArr[2]; k <= endArr[2]; k += 2) {
                    for (int n = startArr[3]; n <= endArr[3]; n += 2) {
                        System.out.printf("%d%d%d%d ", i, j, k, n);
                    }
                }
            }
        }
    }
}

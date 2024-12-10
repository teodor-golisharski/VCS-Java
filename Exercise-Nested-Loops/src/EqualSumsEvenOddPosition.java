import java.util.Scanner;

public class EqualSumsEvenOddPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int left = Integer.parseInt(scanner.nextLine());
        int right = Integer.parseInt(scanner.nextLine());

        for (int i = left; i <= right; i++) {
            String currentNum = "" + i;
            int odd = 0;
            int even = 0;
            for (int j = 0; j < currentNum.length(); j++) {
                if (j % 2 == 0) {
                    even += Integer.parseInt("" + currentNum.charAt(j));
                } else {
                    odd += Integer.parseInt("" + currentNum.charAt(j));
                }
            }
            if(odd == even){
                System.out.print(i + " ");
            }
        }
    }
}

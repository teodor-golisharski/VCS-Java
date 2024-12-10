import java.util.Scanner;

public class SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1111; i <= 9999; i++) {
            String num = "" + i;
            boolean status = true;

            if(num.contains("0")){
                continue;
            }

            for (int j = 0; j < 4; j++) {
                int temp = Integer.parseInt("" + num.charAt(j));

                if (n % temp != 0) {
                    status = false;
                    break;
                }
            }

            if (status) {
                System.out.print(num + " ");
            }
        }
    }
}

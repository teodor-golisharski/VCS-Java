import java.util.Scanner;

public class OddEvenSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int odd = 0;
        int even = 0;
        for (int i = 0; i < n; i++) {
            int temp = Integer.parseInt(scanner.nextLine());

            if (i % 2 == 0) {
                even += temp;
            } else {
                odd += temp;
            }
        }
        if(odd == even){
            System.out.println("Yes");
            System.out.println("Sum = " + odd);
        }
        else{
            System.out.println("No");
            System.out.println("Diff = " + Math.abs(odd - even));
        }
    }
}

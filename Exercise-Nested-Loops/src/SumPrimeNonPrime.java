import java.util.Scanner;

public class SumPrimeNonPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nonPrime = 0;
        int prime = 0;

        String input = scanner.nextLine();
        while (!input.equals("stop")) {
            int num = Integer.parseInt(input);
            if (num < 0) {
                System.out.println("Number is negative.");
            } else {
                boolean isPrime = false;
                for (int i = 2; i <= num / 2; i++) {
                    if (num % i == 0) {
                        nonPrime += num;
                        isPrime = true;
                        break;
                    }
                }
                if (!isPrime) {
                    prime += num;
                }
            }
            input = scanner.nextLine();
        }
        System.out.println("Sum of all prime numbers is: " + prime);
        System.out.println("Sum of all non prime numbers is: " + nonPrime);
    }
}

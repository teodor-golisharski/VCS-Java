import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());

        int cakes = width * length;

        String input = scanner.nextLine();
        while(!input.equals("STOP")){
            int current = Integer.parseInt(input);
            cakes -= current;

            if(cakes < 0){
                System.out.printf("No more cake left! You need %d pieces more.", Math.abs(cakes));
                return;
            }

            input = scanner.nextLine();
        }
        System.out.printf("%d pieces are left.", cakes);
    }
}

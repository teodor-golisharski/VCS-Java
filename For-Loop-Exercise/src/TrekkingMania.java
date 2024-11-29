import java.util.Arrays;
import java.util.Scanner;

public class TrekkingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int groupsCount = Integer.parseInt(scanner.nextLine());
        int people = 0;

        int[] arr = new int[5];
        Arrays.fill(arr, 0);
        for (int i = 0; i < groupsCount; i++) {
            int peopleCount = Integer.parseInt(scanner.nextLine());

            if (peopleCount >= 41) {
                arr[4] += peopleCount;
            }
            else if(peopleCount >= 26){
                arr[3] += peopleCount;
            }
            else if(peopleCount >= 13){
                arr[2] += peopleCount;
            }
            else if(peopleCount >= 6){
                arr[1] += peopleCount;
            }
            else{
                arr[0] += peopleCount;
            }

            people+=peopleCount;
        }

        for (int gr : arr) {
            System.out.printf("%.2f%%%n", (double)gr/people * 100);
        }
    }
}

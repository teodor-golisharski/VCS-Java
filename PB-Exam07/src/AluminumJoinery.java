import java.util.Scanner;

public class AluminumJoinery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int framesCount = Integer.parseInt(scanner.nextLine());

        if(framesCount < 10){
            System.out.println("Invalid order");
            return;
        }

        String type = scanner.nextLine();
        boolean delivery = scanner.nextLine().equals("With delivery");

        double priceCalculated = framesCount;
        switch (type) {
            case "90X130" -> priceCalculated *= (framesCount > 60 ? 0.92 : framesCount > 30 ? 0.95 : 1) * 110;
            case "100X150" -> priceCalculated *= (framesCount > 80 ? 0.90 : framesCount > 40 ? 0.94 : 1) * 140;
            case "130X180" -> priceCalculated *= (framesCount > 50 ? 0.88 : framesCount > 20 ? 0.93 : 1) * 190;
            case "200X300" -> priceCalculated *= (framesCount > 50 ? 0.86 : framesCount > 25 ? 0.91 : 1) * 250;
        }

        priceCalculated += delivery ? 60 : 0;
        if(framesCount > 99){
            priceCalculated *= 0.96;
        }

        System.out.printf("%.2f BGN", priceCalculated);
    }
}

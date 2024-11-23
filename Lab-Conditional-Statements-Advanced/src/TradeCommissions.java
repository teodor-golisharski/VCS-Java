import java.util.Scanner;

public class TradeCommissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String town = scanner.nextLine();
        double sum = Double.parseDouble(scanner.nextLine());

        double coefficient = 0;

        switch (town) {
            case "Sofia" -> {
                if(sum > 10000) coefficient = 0.12;
                else if(sum > 1000) coefficient = 0.08;
                else if(sum > 500) coefficient = 0.07;
                else if(sum >= 0) coefficient = 0.05;
            }
            case "Varna" -> {
                if(sum > 10000) coefficient = 0.13;
                else if(sum > 1000) coefficient = 0.10;
                else if(sum > 500) coefficient = 0.075;
                else if(sum >= 0) coefficient = 0.045;
            }
            case "Plovdiv" -> {
                if(sum > 10000) coefficient = 0.145;
                else if(sum > 1000) coefficient = 0.12;
                else if(sum > 500) coefficient = 0.08;
                else if(sum >= 0) coefficient = 0.055;
            }
        }
        if(coefficient == 0){
            System.out.println("error");
        }
        else{
            System.out.printf("%.2f", sum * coefficient);
        }
    }
}

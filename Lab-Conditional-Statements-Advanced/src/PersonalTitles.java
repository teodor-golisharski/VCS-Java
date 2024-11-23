import java.util.Scanner;

public class PersonalTitles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num = Double.parseDouble(scanner.nextLine());
        String gender = scanner.nextLine();

        String result = "";
        if(gender.equals("m")){
            result = num < 16 ? "Master" : "Mr.";
        }
        else if(gender.equals("f")){
            result = num < 16 ? "Miss": "Ms.";
        }

        System.out.println(result);
    }
}

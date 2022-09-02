
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = String.valueOf(scanner.nextLine());
            if (!input.equals("end")) {
                int inputNumber = Integer.valueOf(input);
                inputNumber = (inputNumber * inputNumber * inputNumber);
                System.out.println(inputNumber);
            } else {
                break;
            }
        }
    }
}

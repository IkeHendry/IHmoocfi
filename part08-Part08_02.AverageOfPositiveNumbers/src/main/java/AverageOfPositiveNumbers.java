
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double positiveTotal = 0;
        int positiveTally = 0;
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input > 0) {
                positiveTotal = positiveTotal + input;
                positiveTally++;
            } else if (input == 0) {
                break;
            }
        }
        if (positiveTally == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            double percentage = (positiveTotal / positiveTally);
            System.out.println(percentage);
        }
    }
}


import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = 0;
        int second = 0;
        while (true) {
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");
            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            } else {
                String[] parts = input.split(" ");

                String command = parts[0];
                int amount = Integer.valueOf(parts[1]);
                if (command.equals("add") && amount > 0) {
                    first = first + amount;
                    if (first > 100) {
                        first = 100;
                    }
                }
                if (command.equals("move") && amount > 0 && first > 0) {
                    if (amount > first) {
                        second = second + first;
                        first = 0;
                    } else {
                        first = first - amount;
                        second = second + amount;
                    }
                    if (second > 100) {
                        second = 100;
                    }
                }
                if (command.equals("remove") && second > 0) {
                    if (amount > second) {
                        second = 0;
                    } else {
                        second = second - amount;
                    }
                }
            }
        }

    }
}

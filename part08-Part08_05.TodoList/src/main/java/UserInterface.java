
import java.util.Scanner;

public class UserInterface {

    private TodoList pList;
    private Scanner scanner;

    public UserInterface(TodoList list, Scanner scan) {
        pList = list;
        scanner = scan;
    }

    public void start() {
        while (true) {
            String input = String.valueOf(scanner.nextLine());
            if (input.equals("stop")) {
                break;
            }
            if (input.equals("add")){
                System.out.println("To add:");
                input = String.valueOf(scanner.nextLine());
                pList.add(input);
            }
            if (input.equals("list")){
                pList.print();
            }
            if (input.equals("remove")){
                System.out.println("Which one is removed?");
                int index = Integer.valueOf(scanner.nextLine());
                pList.remove(index);
            }
        }
    }
}

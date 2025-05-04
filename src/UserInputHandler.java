import java.util.Scanner;

public class UserInputHandler {
    public static int getNumber() {
        Scanner userInput = new Scanner(System.in);
        int number;

        System.out.println("\n==== MULTIPLICATION TABLE ====\n");
        System.out.print("Inform a number: ");

        while (true) {
            if (!userInput.hasNextInt()) {
                System.out.println("Invalid input. Please enter a valid number:");
                userInput.next();
                continue;
            }

            number = userInput.nextInt();
            break;
        }

        return number;
    }
}

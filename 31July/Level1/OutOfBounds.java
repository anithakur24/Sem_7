import java.util.Scanner;

public class OutOfBounds {

    public static void generateException(String input) {
        System.out.println("Character at invalid index: " + input.charAt(input.length()));
    }

    public static void handleException(String input) {
        try {
            System.out.println("Character at invalid index: " + input.charAt(input.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String userInput = sc.next();

        System.out.println("\n=== Generating Exception ===");
        try {
            generateException(userInput);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception caught in main: " + e.getMessage());
        }

        System.out.println("\n=== Handling Exception ===");
        handleException(userInput);

        sc.close();
    }
}

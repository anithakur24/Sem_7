import java.util.Scanner;

public class IllegalArgumentDemo {

    public static void generateException(String input) {
        String result = input.substring(5, 2);
        System.out.println("Substring: " + result);
    }

    public static void handleException(String input) {
        try {
            String result = input.substring(5, 2);
            System.out.println("Substring: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String userInput = sc.next();

        System.out.println("\n=== Generating Exception ===");
        try {
            generateException(userInput);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught in main: " + e.getMessage());
        }

        System.out.println("\n=== Handling Exception ===");
        handleException(userInput);

        sc.close();
    }
}

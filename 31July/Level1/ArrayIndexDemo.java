import java.util.Scanner;

public class ArrayIndexDemo {

    public static void generateException(String[] names, int index) {
        System.out.println("Name at index " + index + ": " + names[index]);
    }

    public static void handleException(String[] names, int index) {
        try {
            System.out.println("Name at index " + index + ": " + names[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] names = {"Alice", "Bob", "Charlie", "Diana"};

        System.out.print("Enter an index to access (0 to " + (names.length - 1) + "): ");
        int userIndex = sc.nextInt();

        System.out.println("\n=== Generating Exception ===");
        try {
            generateException(names, userIndex + 10);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught in main: " + e.getMessage());
        }

        System.out.println("\n=== Handling Exception ===");
        handleException(names, userIndex + 10);

        sc.close();
    }
}

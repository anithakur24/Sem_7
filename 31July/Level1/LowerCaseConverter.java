import java.util.Scanner;

public class LowerCaseConverter {

    // Method to convert string to lowercase using ASCII and charAt()
    public static String convertToLowerUsingCharAt(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                result += (char)(ch + 32); // Convert to lowercase
            } else {
                result += ch; // Keep other characters as is
            }
        }
        return result;
    }

    // Method to compare two strings using charAt()
    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String inputText = sc.nextLine();

        String customLower = convertToLowerUsingCharAt(inputText);
        String builtInLower = inputText.toLowerCase();

        boolean areEqual = compareStrings(customLower, builtInLower);

        System.out.println("\nConverted using charAt(): " + customLower);
        System.out.println("Converted using toLowerCase(): " + builtInLower);
        System.out.println("Are both results equal? " + areEqual);

        sc.close();
    }
}

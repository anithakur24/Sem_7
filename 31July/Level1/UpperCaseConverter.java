import java.util.Scanner;

public class UpperCaseConverter {

    // Method to convert string to uppercase manually using ASCII logic
    public static String convertToUpperUsingCharAt(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                result += (char)(ch - 32);
            } else {
                result += ch;
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

        String customUpper = convertToUpperUsingCharAt(inputText);
        String builtInUpper = inputText.toUpperCase();

        boolean areEqual = compareStrings(customUpper, builtInUpper);

        System.out.println("\nConverted using charAt(): " + customUpper);
        System.out.println("Converted using toUpperCase(): " + builtInUpper);
        System.out.println("Are both results equal? " + areEqual);

        sc.close();
    }
}

import java.util.Scanner;

public class CharacterTypeChecker {

    // Method to check the type of character
    public static String getCharType(char ch) {
        // Convert to lowercase if it's uppercase using ASCII
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char)(ch + 32);  // convert to lowercase
        }

        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        } else {
            return "Not a Letter";
        }
    }

    // Method to analyze string and return 2D array
    public static String[][] analyzeCharacters(String str) {
        int len = 0;

        try {
            while (true) {
                str.charAt(len);
                len++;
            }
        } catch (Exception e) {
            // length calculated
        }

        String[][] result = new String[len][2];

        for (int i = 0; i < len; i++) {
            char ch = str.charAt(i);
            result[i][0] = String.valueOf(ch);
            result[i][1] = getCharType(ch);
        }

        return result;
    }

    // Method to display 2D array in tabular format
    public static void displayTable(String[][] table) {
        System.out.printf("%-10s %-15s\n", "Character", "Type");
        System.out.println("--------------------------");

        for (int i = 0; i < table.length; i++) {
            System.out.printf("%-10s %-15s\n", table[i][0], table[i][1]);
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String[][] result = analyzeCharacters(input);
        displayTable(result);

        sc.close();
    }
}

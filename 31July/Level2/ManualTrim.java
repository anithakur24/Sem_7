import java.util.Scanner;

public class ManualTrim {

    // Method to find start and end index without leading/trailing spaces
    public static int[] findTrimIndices(String str) {
        int start = 0, end = 0;
        boolean foundStart = false;

        try {
            while (true) {
                char ch = str.charAt(end);
                if (!foundStart && ch != ' ') {
                    start = end;
                    foundStart = true;
                }
                end++;
            }
        } catch (Exception e) {
            end--; // adjust for last index
            while (end >= 0 && str.charAt(end) == ' ') {
                end--;
            }
        }

        return new int[]{start, end};
    }

    // Method to get substring using charAt()
    public static String getSubstring(String str, int start, int end) {
        String result = "";
        for (int i = start; i <= end; i++) {
            result += str.charAt(i);
        }
        return result;
    }

    // Method to compare two strings using charAt()
    public static boolean compareStrings(String s1, String s2) {
        int i = 0;
        try {
            while (true) {
                if (s1.charAt(i) != s2.charAt(i)) return false;
                i++;
            }
        } catch (Exception e) {
            try {
                s2.charAt(i); // ensure both are of same length
                return false;
            } catch (Exception ex) {
                return true;
            }
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string with leading/trailing spaces: ");
        String input = sc.nextLine();

        int[] trimIndices = findTrimIndices(input);
        String manualTrimmed = getSubstring(input, trimIndices[0], trimIndices[1]);
        String builtInTrimmed = input.trim();

        System.out.println("\nManual Trimmed String: '" + manualTrimmed + "'");
        System.out.println("Built-in Trimmed String: '" + builtInTrimmed + "'");

        boolean areEqual = compareStrings(manualTrimmed, builtInTrimmed);
        System.out.println("\nAre both results equal? " + (areEqual ? "Yes" : "No"));

        sc.close();
    }
}

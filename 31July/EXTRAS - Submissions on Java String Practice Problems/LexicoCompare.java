import java.util.Scanner;

public class LexicoCompare {
    public static int compareStrings(String s1, String s2) {
        if (s1 == null || s2 == null) {
            throw new IllegalArgumentException("Strings must not be null");
        }
        int min = Math.min(s1.length(), s2.length());
        for (int i = 0; i < min; i++) {
            char a = s1.charAt(i);
            char b = s2.charAt(i);
            if (a != b) {
                return a - b;
            }
        }
        return s1.length() - s2.length();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("String 1: ");
        String s1 = sc.nextLine();
        System.out.print("String 2: ");
        String s2 = sc.nextLine();
        sc.close();

        int result = compareStrings(s1, s2);
        if (result < 0) {
            System.out.println("\"" + s1 + "\" comes before \"" + s2 + "\"");
        } else if (result > 0) {
            System.out.println("\"" + s1 + "\" comes after \"" + s2 + "\"");
        } else {
            System.out.println("Both strings are equal.");
        }
    }
}

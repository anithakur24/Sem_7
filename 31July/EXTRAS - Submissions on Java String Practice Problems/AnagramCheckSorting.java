import java.util.Arrays;
import java.util.Scanner;

public class AnagramCheckSorting {
    public static boolean areAnagrams(String s1, String s2) {
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        if (s1.length() != s2.length()) return false;

        char[] a1 = s1.toCharArray();
        char[] a2 = s2.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);

        return Arrays.equals(a1, a2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("First string: ");
        String s1 = sc.nextLine();
        System.out.print("Second string: ");
        String s2 = sc.nextLine();
        sc.close();

        if (areAnagrams(s1, s2)) {
            System.out.println("They are anagrams.");
        } else {
            System.out.println("Not anagrams.");
        }
    }
}


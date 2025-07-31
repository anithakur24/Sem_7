import java.util.Scanner;

public class RemoveChar {
    public static String removeWithReplace(String s, char ch) {
        return s.replace(String.valueOf(ch), "");
    }

    public static String removeWithBuilder(String s, char ch) {
        StringBuilder sb = new StringBuilder(s.length());
        for (char c : s.toCharArray()) {
            if (c != ch) sb.append(c);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("String: ");
        String input = sc.nextLine();
        System.out.print("Character to remove: ");
        char ch = sc.next().charAt(0);
        sc.close();

        System.out.println("Result (replace): " + removeWithReplace(input, ch));
        System.out.println("Result (builder): " + removeWithBuilder(input, ch));
    }
}

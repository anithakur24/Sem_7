import java.util.Scanner;

public class WordReplacer {
    public static String replaceWord(String sentence, String target, String replacement) {
        if (sentence == null || target == null || target.isEmpty()) {
            return sentence;
        }
        // \b ensures word boundary; Pattern.quote escapes regex meta-characters
        return sentence.replaceAll("\\b" + java.util.regex.Pattern.quote(target) + "\\b", replacement);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter sentence: ");
        String sentence = sc.nextLine();
        System.out.print("Word to replace: ");
        String target = sc.next();
        System.out.print("Replacement word: ");
        String replacement = sc.next();
        sc.close();

        String result = replaceWord(sentence, target, replacement);
        System.out.println("Result: " + result);
    }
}

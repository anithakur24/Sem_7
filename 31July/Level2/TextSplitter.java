import java.util.Scanner;

public class TextSplitter {

    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (Exception e) {
        }
        return count;
    }

    public static String[] splitTextWithoutSplit(String text) {
        int len = findLength(text);
        int wordCount = 0;

        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }
        wordCount++; // Last word

        int[] spaceIndexes = new int[wordCount + 1];
        int index = 0;
        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndexes[index++] = i;
            }
        }
        spaceIndexes[index++] = len;

        String[] words = new String[wordCount];
        int start = 0;
        for (int i = 0; i < wordCount; i++) {
            int end = spaceIndexes[i];
            String word = "";
            for (int j = start; j < end; j++) {
                word += text.charAt(j);
            }
            words[i] = word;
            start = end + 1;
        }

        return words;
    }

    public static boolean compareStringArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) return false;

        for (int i = 0; i < arr1.length; i++) {
            int len1 = findLength(arr1[i]);
            int len2 = findLength(arr2[i]);
            if (len1 != len2) return false;

            for (int j = 0; j < len1; j++) {
                if (arr1[i].charAt(j) != arr2[i].charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();

        String[] customSplit = splitTextWithoutSplit(input);
        String[] builtInSplit = input.split(" ");

        System.out.println("\nCustom split:");
        for (String word : customSplit) {
            System.out.println(word);
        }

        System.out.println("\nBuilt-in split:");
        for (String word : builtInSplit) {
            System.out.println(word);
        }

        boolean isEqual = compareStringArrays(customSplit, builtInSplit);
        System.out.println("\nAre both results equal? " + isEqual);

        sc.close();
    }
}

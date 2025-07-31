import java.util.Scanner;

public class Analyzer {

    // Method to find string length without using length()
    public static int getLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {
        }
        return count;
    }

    // Method to split text into words using charAt()
    public static String[] splitIntoWords(String text) {
        int len = getLength(text);
        int wordCount = 0;

        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }
        wordCount++; // for the last word

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

    // Method to create a 2D array with words and their lengths
    public static String[][] getWordsWithLengths(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(getLength(words[i]));
        }
        return result;
    }

    // Method to find shortest and longest word from 2D array
    public static int[] findShortestAndLongest(String[][] wordData) {
        int minIndex = 0, maxIndex = 0;
        int minLength = Integer.parseInt(wordData[0][1]);
        int maxLength = Integer.parseInt(wordData[0][1]);

        for (int i = 1; i < wordData.length; i++) {
            int length = Integer.parseInt(wordData[i][1]);
            if (length < minLength) {
                minLength = length;
                minIndex = i;
            }
            if (length > maxLength) {
                maxLength = length;
                maxIndex = i;
            }
        }
        return new int[]{minIndex, maxIndex};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();

        String[] words = splitIntoWords(input);
        String[][] wordData = getWordsWithLengths(words);
        int[] resultIndexes = findShortestAndLongest(wordData);

        String shortest = wordData[resultIndexes[0]][0];
        int shortestLen = Integer.parseInt(wordData[resultIndexes[0]][1]);

        String longest = wordData[resultIndexes[1]][0];
        int longestLen = Integer.parseInt(wordData[resultIndexes[1]][1]);

        System.out.println("\nWords and Lengths:");
        System.out.println("--------------------");
        for (String[] row : wordData) {
            System.out.println(row[0] + "\t\t" + row[1]);
        }

        System.out.println("\nShortest Word: " + shortest + " (Length: " + shortestLen + ")");
        System.out.println("Longest Word : " + longest + " (Length: " + longestLen + ")");

        sc.close();
    }
}

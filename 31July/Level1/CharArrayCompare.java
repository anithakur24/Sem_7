import java.util.Scanner;

public class CharArrayCompare {

    public static char[] customToCharArray(String str) {
        char[] result = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            result[i] = str.charAt(i);
        }
        return result;
    }

    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void printCharArray(char[] arr) {
        for (char c : arr) {
            System.out.print(c + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.next();

        
        char[] customArray = customToCharArray(input);
        char[] builtInArray = input.toCharArray();

        boolean areEqual = compareCharArrays(customArray, builtInArray);

        System.out.print("\nCustom char array:    ");
        printCharArray(customArray);

        System.out.print("Built-in char array: ");
        printCharArray(builtInArray);

        
        System.out.println("Are both arrays equal? " + areEqual);

        sc.close();
    }
}

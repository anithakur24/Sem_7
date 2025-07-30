import java.util.Scanner;

public class SmallestAndLargest {

    public static int[] findSmallestAndLargest(int number1, int number2, int number3) {
        int min = number1;
        int max = number1;

        if (number2 < min) {
            min = number2;
        } else if (number2 > max) {
            max = number2;
        }
        if (number3 < min) {
            min = number3;
        } else if (number3 > max) {
            max = number3;
        }

        return new int[] { min, max };
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = scanner.nextInt();

        System.out.print("Enter second number: ");
        int b = scanner.nextInt();

        System.out.print("Enter third number: ");
        int c = scanner.nextInt();

        scanner.close();

        int[] result = findSmallestAndLargest(a, b, c);

        System.out.println("Smallest number is: " + result[0]);
        System.out.println("Largest number is: " + result[1]);
    }
}

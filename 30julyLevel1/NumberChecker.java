import java.util.Scanner;

public class NumberChecker {

    public static int checkSign(int number) {
        if (number > 0) {
            return 1;
        } else if (number < 0) {
            return -1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();
        scanner.close();

        int sign = checkSign(num);

        if (sign == 1) {
            System.out.println(num + " is positive.");
        } else if (sign == -1) {
            System.out.println(num + " is negative.");
        } else {
            System.out.println("The number is zero.");
        }
    }
}

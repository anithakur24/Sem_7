import java.util.Scanner;

public class NaturalNumSum {

    public static int sumOfNaturalNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer n: ");
        int n = scanner.nextInt();
        scanner.close();

        if (n <= 0) {
            System.out.println("Please enter a positive integer greater than zero.");
        } else {
            int total = sumOfNaturalNumbers(n);
            System.out.println("The sum of the first " + n + " natural numbers is " + total);
        }
    }
}


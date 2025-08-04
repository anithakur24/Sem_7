import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        float number1 = input.nextFloat();

        System.out.print("Enter the second number: ");
        float number2 = input.nextFloat();

        float sum = number1 + number2;
        float difference = number1 - number2;
        float product = number1 * number2;
        float quotient = number1 / number2;

        System.out.println("The addition, subtraction, multiplication and division value of 2 numbers "
                + number1 + " and " + number2 + " is " + sum + ", " + difference + ", " + product + ", and " + quotient);

        input.close();
    }
}

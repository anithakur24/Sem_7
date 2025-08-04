import java.util.Scanner;

public class DiscountCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the student fee: ");
        float fee = input.nextFloat();

        System.out.print("Enter the discount percentage: ");
        float discountPercent = input.nextFloat();

        float discount = (discountPercent / 100) * fee;
        float discountedFee = fee - discount;

        System.out.println("The discount amount is INR " + discount +
                           " and the discounted price the student will pay is INR " + discountedFee);

        input.close();
    }
}

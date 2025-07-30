import java.util.Scanner;

public class TriangleRun {
    public static int roundsNeeded(double side1, double side2, double side3) {
      
        double perimeter = side1 + side2 + side3;
        if (perimeter <= 0) {
            return 0; 
        }
        return (int)(5000 / perimeter);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter side 1 of triangular park (in meters): ");
        double a = scanner.nextDouble();

        System.out.print("Enter side 2 of triangular park (in meters): ");
        double b = scanner.nextDouble();

        System.out.print("Enter side 3 of triangular park (in meters): ");
        double c = scanner.nextDouble();

        int rounds = roundsNeeded(a, b, c);

        System.out.println("To run 5km, the athlete needs to complete " 
            + rounds + " rounds of the triangular park.");

        scanner.close();
    }
}

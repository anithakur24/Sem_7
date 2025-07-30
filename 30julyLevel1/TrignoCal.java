import java.util.Scanner;

public class TrignoCal {


    public static double[] calculateTrigonometricFunctions(double angleDegrees) {
        double radians = Math.toRadians(angleDegrees);  
        double sinVal = Math.sin(radians);
        double cosVal = Math.cos(radians);
        double tanVal = Math.tan(radians);
        return new double[] { sinVal, cosVal, tanVal };
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter angle in degrees: ");
        double angle = scanner.nextDouble();
        scanner.close();

        double[] results = calculateTrigonometricFunctions(angle);

        System.out.printf("Sine(%.2f°)   = %.6f%n", angle, results[0]);
        System.out.printf("Cosine(%.2f°) = %.6f%n", angle, results[1]);
        System.out.printf("Tangent(%.2f°)= %.6f%n", angle, results[2]);
    }
}

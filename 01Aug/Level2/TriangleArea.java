import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base in cm: ");
        double base = sc.nextDouble();

        System.out.print("Enter height in cm: ");
        double height = sc.nextDouble();

        double areaCm = 0.5 * base * height;

        double areaInches = areaCm / 6.4516;

        System.out.printf("The Area of the triangle in sq in is %.2f and sq cm is %.2f%n", areaInches, areaCm);
    }
}

import java.util.Scanner;

public class WindChillCalculator {
    public static double calculateWindChill(double temperature, double windSpeed) {
        double vPow = Math.pow(windSpeed, 0.16);
        return 35.74
             + 0.6215 * temperature
             - 35.75 * vPow
             + 0.4275 * temperature * vPow;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter air temperature F: ");
        double temp = scanner.nextDouble();

        System.out.print("Enter wind speed mph: ");
        double speed = scanner.nextDouble();

        scanner.close();

        if (temp > 50 || speed < 3) {
            System.out.println("Note: Wind chill formula is valid only for temp ≤ 50°F and wind speed ≥ 3 mph.");
        }

        double windChill = calculateWindChill(temp, speed);

        System.out.printf("Wind chill temperature is: %.2f °F%n", windChill);
    }
}

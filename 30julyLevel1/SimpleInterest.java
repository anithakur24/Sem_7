import java.util.Scanner;
public class SimpleInterest {
    public static double claculateSimpleInterest(double principal, double rate, double time){
        return (principal*rate*time)/100.0;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("enter the principal amount: ");
        double principal = scanner.nextDouble();

        System.out.print("enter the rate of interest in(%): ");
        double rate = scanner.nextDouble();

        System.out.print("Enter the time duration in years: ");
        double time = scanner.nextDouble();

        scanner.close();

        double SimpleInterest = claculateSimpleInterest(principal, rate, time);

        System.out.print("The Simple Interest is "+SimpleInterest+" for Principal "+principal+", Rate of interest "+rate+" and time "+time);
           }
}
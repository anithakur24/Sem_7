import java.util.Scanner;
public class HandShake{
    public static long calculateHandShakes(long n){
        if(n<2){
            return 0;
        }
        return (n*(n-1))/2;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter the number of students: ");
        long n = scanner.nextLong();
        long totalHandShakes = calculateHandShakes(n);
        System.out.println("Maximum number of handshakes among "+n+" students is "+totalHandShakes);
        scanner.close();
    }
}
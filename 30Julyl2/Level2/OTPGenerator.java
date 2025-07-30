import java.util.HashSet;

public class OTPGenerator {
    public static String generateOTP() {
        int num = (int)(Math.random() * 1_000_000); 
        return String.format("%06d", num);
    }
    public static boolean allUnique(String[] otps) {
        HashSet<String> set = new HashSet<>();
        for (String otp : otps) {
            if (!set.add(otp)) {
                return false;
            }
        }
        return true;
    }
}

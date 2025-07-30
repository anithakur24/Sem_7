public class NumberChecker {

    public static int countDigits(int number) {
        if (number == 0) return 1;
        number = Math.abs(number);
        int count = 0;
        while (number != 0) {
            number /= 10;
            count++;
        }
        return count;
    }

    public static int[] extractDigits(int number) {
        int n = Math.abs(number);
        int len = countDigits(n);
        int[] digits = new int[len];
        for (int i = len - 1; i >= 0; i--) {
            digits[i] = n % 10;
            n /= 10;
        }
        return digits;
    }

    public static boolean isDuckNumber(int number) {
        String s = Integer.toString(Math.abs(number));
        if (s.charAt(0) == '0') return false;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == '0') return true;
        }
        return false;
    }

    public static boolean isArmstrong(int number) {
        int[] d = extractDigits(number);
        int n = d.length;
        int sum = 0;
        for (int digit : d) {
            sum += Math.pow(digit, n);
        }
        return sum == number;
    }

    public static int[] largestAndSecondLargest(int number) {
        int[] d = extractDigits(number);
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;
        for (int val : d) {
            if (val > max1) {
                max2 = max1;
                max1 = val;
            } else if (val > max2 && val != max1) {
                max2 = val;
            }
        }
        return new int[] { max1, max2 };
    }

    public static int[] smallestAndSecondSmallest(int number) {
        int[] d = extractDigits(number);
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
        for (int val : d) {
            if (val < min1) {
                min2 = min1;
                min1 = val;
            } else if (val < min2 && val != min1) {
                min2 = val;
            }
        }
        return new int[] { min1, min2 };
    }
}

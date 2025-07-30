import java.util.Arrays;
import java.util.Random;

public class FootballTeamHeight {

    public static int[] generateHeights() {
        int[] heights = new int[11];
        Random rand = new Random();
        for (int i = 0; i < heights.length; i++) {
            heights[i] = rand.nextInt(101) + 150; 
        }
        return heights;
    }

    public static int sumHeights(int[] heights) {
        int sum = 0;
        for (int h : heights) {
            sum += h;
        }
        return sum;
    }

    public static double meanHeight(int[] heights) {
        return sumHeights(heights) / (double) heights.length;
    }

    public static int shortestHeight(int[] heights) {
        int min = heights[0];
        for (int h : heights) {
            if (h < min) {
                min = h;
            }
        }
        return min;
    }

    public static int tallestHeight(int[] heights) {
        int max = heights[0];
        for (int h : heights) {
            if (h > max) {
                max = h;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] heights = generateHeights();
        System.out.println("Heights (cms): " + Arrays.toString(heights));
        
        int sum = sumHeights(heights);
        double mean = meanHeight(heights);
        int shortest = shortestHeight(heights);
        int tallest = tallestHeight(heights);
        
        System.out.println("Sum of heights     = " + sum + " cm");
        System.out.printf("Mean height        = %.2f cm%n", mean);
        System.out.println("Shortest height    = " + shortest + " cm");
        System.out.println("Tallest height     = " + tallest + " cm");
    }
}

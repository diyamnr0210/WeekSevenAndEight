import java.util.Random;

public class L3Q1{
    public static void main(String[] args) {
        int[] heights = new int[11];
        Random rand = new Random();
        for (int i = 0; i < heights.length; i++) {
            heights[i] = rand.nextInt(101) + 150; 
        }
        System.out.print("Team Heights (cm): ");
        for (int h : heights) System.out.print(h + " ");
        System.out.println("\n\n--- Statistics ---");
        System.out.println("Sum of Heights: " + findSum(heights));
        System.out.println("Mean Height: " + findMean(heights));
        System.out.println("Shortest Player: " + findShortest(heights));
        System.out.println("Tallest Player: " + findTallest(heights));
    }
    public static int findSum(int[] arr) {
        int sum = 0;
        for (int val : arr) sum += val;
        return sum;
    }
    public static double findMean(int[] arr) {
        return (double) findSum(arr) / arr.length;
    }
    public static int findShortest(int[] arr) {
        int min = arr[0];
        for (int val : arr) if (val < min) min = val;
        return min;
    }
    public static int findTallest(int[] arr) {
        int max = arr[0];
        for (int val : arr) if (val > max) max = val;
        return max;
    }
}
import java.util.Scanner;

public class L2Q12 {
    public static void main(String[] args) {
        int[] randomNumbers = generate4DigitRandomArray(5);
        
        System.out.print("Generated Numbers: ");
        for (int n : randomNumbers) System.out.print(n + " ");
        
        double[] stats = findAverageMinMax(randomNumbers);
        
        System.out.println("\nAverage: " + stats[0]);
        System.out.println("Minimum: " + (int)stats[1]);
        System.out.println("Maximum: " + (int)stats[2]);
    }

    public static int[] generate4DigitRandomArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            // Generates number between 1000 and 9999
            arr[i] = (int)(Math.random() * 9000) + 1000;
        }
        return arr;
    }

    public static double[] findAverageMinMax(int[] numbers) {
        double sum = 0;
        int min = numbers[0];
        int max = numbers[0];

        for (int n : numbers) {
            sum += n;
            min = Math.min(min, n);
            max = Math.max(max, n);
        }

        double avg = sum / numbers.length;
        return new double[]{avg, (double)min, (double)max};
    }
}
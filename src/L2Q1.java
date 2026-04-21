import java.util.Scanner;
public class L2Q1{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        int[] factors = findFactors(num);
        System.out.print("Factors: ");
        for (int f : factors) {
            System.out.print(f + " ");
        }
        System.out.println("\nSum of factors: " + calculateSum(factors));
        System.out.println("Product of factors: " + calculateProduct(factors));
        System.out.println("Sum of squares: " + calculateSumOfSquares(factors));
    }
    public static int[] findFactors(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        int[] factorsArray = new int[count];
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factorsArray[index++] = i;
            }
        }
        return factorsArray;
    }
    public static int calculateSum(int[] factors) {
        int sum = 0;
        for (int f : factors) {
            sum += f;
        }
        return sum;
    }
    public static long calculateProduct(int[] factors) {
        long product = 1;
        for (int f : factors) {
            product *= f;
        }
        return product;
    }
    public static double calculateSumOfSquares(int[] factors) {
        double sumSquares = 0;
        for (int f : factors) {
            sumSquares += Math.pow(f, 2);
        }
        return sumSquares;
    }
}
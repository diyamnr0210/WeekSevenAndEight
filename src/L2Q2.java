import java.util.Scanner;
public class L2Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer (n): ");
        int n = input.nextInt();
        if (n <= 0) {
            System.out.println("The number is not a natural number (must be > 0).");
        } else {
            int recursiveSum = calculateRecursiveSum(n);
            int formulaSum = calculateFormulaSum(n);
            System.out.println("Sum using Recursion: " + recursiveSum);
            System.out.println("Sum using Formula: " + formulaSum);
            if (recursiveSum == formulaSum) {
                System.out.println("Success: Both computations match!");
            } else {
                System.out.println("Error: The computations do not match.");
            }
        }
    }
    public static int calculateRecursiveSum(int n) {
        if (n == 1) {
            return 1;
        }
        return n + calculateRecursiveSum(n - 1);
    }
    public static int calculateFormulaSum(int n) {
        return (n * (n + 1)) / 2;
    }
}
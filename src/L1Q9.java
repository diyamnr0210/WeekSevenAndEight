import java.util.Scanner;
public class L1Q9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of chocolates (N): ");
        int numberOfChocolates = input.nextInt();
        System.out.print("Enter the number of children (M): ");
        int numberOfChildren = input.nextInt();
        int[] results = findRemainderAndQuotient(numberOfChocolates, numberOfChildren);
        int eachChildGets = results[1];
        int remainingChocolates = results[0];
        System.out.println("Each child will get: " + eachChildGets);
        System.out.println("Remaining chocolates: " + remainingChocolates);
    }
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int remainder = number % divisor;
        int quotient = number / divisor;
        return new int[]{remainder, quotient};
    }
}
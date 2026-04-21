import java.util.Scanner;
public class L1Q8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number (dividend): ");
        int number = input.nextInt();
        System.out.print("Enter the divisor: ");
        int divisor = input.nextInt();
        int[] results = findRemainderAndQuotient(number, divisor);
        System.out.println("Quotient: " + results[1]);
        System.out.println("Remainder: " + results[0]);
    }
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int remainder = number % divisor;
        int quotient = number / divisor;
        return new int[]{remainder, quotient};
    }
}
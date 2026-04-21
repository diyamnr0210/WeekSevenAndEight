import java.util.Scanner;
public class L1Q7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int n1 = input.nextInt();
        System.out.print("Enter second number: ");
        int n2 = input.nextInt();
        System.out.print("Enter third number: ");
        int n3 = input.nextInt();
        int[] results = findSmallestAndLargest(n1, n2, n3);
        System.out.println("The smallest number is: " + results[0]);
        System.out.println("The largest number is: " + results[1]);
    }
    public static int[] findSmallestAndLargest(int number1, int number2, int number3) {
        int smallest = number1;
        int largest = number1;
        if (number2 < smallest) smallest = number2;
        if (number3 < smallest) smallest = number3;
        if (number2 > largest) largest = number2;
        if (number3 > largest) largest = number3;
        return new int[]{smallest, largest};
    }
}
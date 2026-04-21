import java.util.Scanner;

public class L3Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check: ");
        int num = sc.nextInt();

        int[] digits = storeDigits(num);
        
        System.out.println("Digit Count: " + getDigitCount(num));
        System.out.println("Is Duck Number: " + isDuckNumber(digits));
        System.out.println("Is Armstrong Number: " + isArmstrong(num, digits));
        
        int[] topTwo = findLargestTwo(digits);
        System.out.println("Largest: " + topTwo[0] + ", Second Largest: " + topTwo[1]);
        
        int[] bottomTwo = findSmallestTwo(digits);
        System.out.println("Smallest: " + bottomTwo[0] + ", Second Smallest: " + bottomTwo[1]);
    }

    public static int getDigitCount(int num) {
        return String.valueOf(Math.abs(num)).length();
    }

    public static int[] storeDigits(int num) {
        String s = String.valueOf(Math.abs(num));
        int[] digits = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            digits[i] = Character.getNumericValue(s.charAt(i));
        }
        return digits;
    }

    public static boolean isDuckNumber(int[] digits) {
        for (int d : digits) {
            if (d == 0) return true;
        }
        return false;
    }

    public static boolean isArmstrong(int originalNum, int[] digits) {
        int sum = 0;
        int power = digits.length;
        for (int d : digits) {
            sum += Math.pow(d, power);
        }
        return sum == originalNum;
    }

    public static int[] findLargestTwo(int[] digits) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for (int d : digits) {
            if (d > first) {
                second = first;
                first = d;
            } else if (d > second && d != first) {
                second = d;
            }
        }
        return new int[]{first, second};
    }

    public static int[] findSmallestTwo(int[] digits) {
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        for (int d : digits) {
            if (d < first) {
                second = first;
                first = d;
            } else if (d < second && d != first) {
                second = d;
            }
        }
        return new int[]{first, second};
    }
}
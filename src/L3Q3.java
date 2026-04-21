import java.util.Scanner;

public class L3Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] digits = storeDigits(num);

        System.out.println(getDigitCount(num));
        System.out.println(getSumOfDigits(digits));
        System.out.println(getSumOfSquares(digits));
        System.out.println(isHarshad(num, digits));

        int[][] freq = getDigitFrequency(digits);
        for (int i = 0; i < freq.length; i++) {
            System.out.println(freq[i][0] + " : " + freq[i][1]);
        }
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

    public static int getSumOfDigits(int[] digits) {
        int sum = 0;
        for (int d : digits) sum += d;
        return sum;
    }

    public static int getSumOfSquares(int[] digits) {
        int sum = 0;
        for (int d : digits) sum += Math.pow(d, 2);
        return sum;
    }

    public static boolean isHarshad(int num, int[] digits) {
        int sum = getSumOfDigits(digits);
        return num % sum == 0;
    }

    public static int[][] getDigitFrequency(int[] digits) {
        int[] count = new int[10];
        int unique = 0;
        for (int d : digits) {
            if (count[d] == 0) unique++;
            count[d]++;
        }
        int[][] freq = new int[unique][2];
        int index = 0;
        for (int i = 0; i < 10; i++) {
            if (count[i] > 0) {
                freq[index][0] = i;
                freq[index][1] = count[i];
                index++;
            }
        }
        return freq;
    }
}
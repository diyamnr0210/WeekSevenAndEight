import java.util.Scanner;
public class L1Q3{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first side in meters: ");
		double side1 = sc.nextDouble();
		System.out.println("Enter the second side in meters: ");
		double side2 = sc.nextDouble();
		System.out.println("Enter the third side in meters: ");
		double side3 = sc.nextDouble();
		double perimeter = side1 + side2 + side3;
		double rounds = calculateRounds(perimeter);
		System.out.println("The athelete needs to run "+ rounds + "rounds to complete 5km");
	}
	public static double calculateRounds(double perimeter){
		return 5000/perimeter;
	}
}
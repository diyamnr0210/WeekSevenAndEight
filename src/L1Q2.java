import java.util.Scanner;
public class L1Q2{
	public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the number of students: ");
	int NumberofStudents = scanner.nextInt();
	int n = NumberofStudents;
	int numberofHandshakes = handshakes(n);
	System.out.println("The number of handshakes possible for " + NumberofStudents + " of students is " + numberofHandshakes);
	}
	public static int handshakes(int n){
		return (n*(n-1))/2;
	}
}
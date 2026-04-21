import java.util.Scanner;
public class L1Q4{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an integer:");
		int n = sc.nextInt();
		int number = sign(n);
	}
	public static int sign(int n){
		if(n > 0){
			return 1;
		}
		else if(n < 1){
			return -1;
		}
		else{
			return 0;
		}
	}
}

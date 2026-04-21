import java.util.Scanner;
public class L2Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] studentAges = new int[10];
        System.out.println("Please enter the age for 10 students:");
        for (int i = 0; i < studentAges.length; i++) {
            System.out.print("Enter age for student " + (i + 1) + ": ");
            studentAges[i] = sc.nextInt();
        }        
        StudentVoteChecker checker = new StudentVoteChecker();
        for (int i = 0; i < studentAges.length; i++) {
            int currentAge = studentAges[i];
            boolean canVote = checker.canStudentVote(currentAge);
            
            String status = canVote ? "CAN vote." : "CANNOT vote.";
            System.out.println("Student " + (i + 1) + " (Age: " + currentAge + "): " + status);
        }
        
        sc.close();
    }
    public boolean canStudentVote(int age) {
        if (age < 0) {
            return false;
        }
        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }
}
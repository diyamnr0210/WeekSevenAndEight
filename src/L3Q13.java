import java.util.Scanner;

public class L1Q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numStudents = sc.nextInt();
        
        int[][] scores = generateScores(numStudents);
        
        System.out.println("ID\tPhy\tChem\tMath\tTotal\tAvg\t%\tGrade");
        for (int i = 0; i < numStudents; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double avg = total / 3.0;
            double percentage = (total / 300.0) * 100;
            String grade = getGrade(percentage);
            
            System.out.printf("%d\t%d\t%d\t%d\t%d\t%.1f\t%.1f\t%s\n", 
                (i + 1), scores[i][0], scores[i][1], scores[i][2], total, avg, percentage, grade);
        }
    }

    public static int[][] generateScores(int size) {
        int[][] scores = new int[size][3];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < 3; j++) {
                scores[i][j] = (int)(Math.random() * 90) + 10;
            }
        }
        return scores;
    }

    public static String getGrade(double pct) {
        if (pct >= 80) return "A";
        if (pct >= 70) return "B";
        if (pct >= 60) return "C";
        if (pct >= 50) return "D";
        if (pct >= 40) return "E";
        return "R";
    }
}
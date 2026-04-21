import java.util.Scanner;

public class L1Q11 {
    public static void main(String[] args) {
        double[][] employeeData = new double[10][2];
        generateData(employeeData);
        
        double[][] results = calculateNewSalaryAndBonus(employeeData);
        double[] totals = calculateTotals(employeeData, results);
        
        System.out.println("Old Salary\tYears\tBonus\tNew Salary");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%.2f\t%.0f\t%.2f\t%.2f\n", 
                employeeData[i][0], employeeData[i][1], results[i][1], results[i][0]);
        }
        
        System.out.println("\n--- Totals ---");
        System.out.printf("Sum Old Salary: %.2f\n", totals[0]);
        System.out.printf("Sum New Salary: %.2f\n", totals[1]);
        System.out.printf("Total Bonus Amount: %.2f\n", totals[2]);
    }

    public static void generateData(double[][] data) {
        for (int i = 0; i < 10; i++) {
            data[i][0] = 10000 + (Math.random() * 90000);
            data[i][1] = (int)(Math.random() * 11);
        }
    }

    public static double[][] calculateNewSalaryAndBonus(double[][] data) {
        double[][] results = new double[10][2];
        for (int i = 0; i < 10; i++) {
            double salary = data[i][0];
            double years = data[i][1];
            double bonusPercent = (years > 5) ? 0.05 : 0.02;
            double bonusAmount = salary * bonusPercent;
            results[i][0] = salary + bonusAmount;
            results[i][1] = bonusAmount;
        }
        return results;
    }

    public static double[] calculateTotals(double[][] oldData, double[][] newData) {
        double sumOld = 0, sumNew = 0, totalBonus = 0;
        for (int i = 0; i < 10; i++) {
            sumOld += oldData[i][0];
            sumNew += newData[i][0];
            totalBonus += newData[i][1];
        }
        return new double[]{sumOld, sumNew, totalBonus};
    }
}
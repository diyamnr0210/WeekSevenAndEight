import java.util.Scanner;

public class L2Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] data = new double[10][3];
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Person " + (i + 1));
            System.out.print("Enter weight (kg): ");
            data[i][0] = sc.nextDouble();
            System.out.print("Enter height (cm): ");
            data[i][1] = sc.nextDouble();
            
            // Calculate and store BMI in the third column
            data[i][2] = calculateBMI(data[i][0], data[i][1]);
        }

        String[] statuses = determineStatus(data);

        System.out.println("\nWeight\tHeight\tBMI\tStatus");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%.1f\t%.1f\t%.1f\t%s\n", data[i][0], data[i][1], data[i][2], statuses[i]);
        }
    }

    public static double calculateBMI(double weight, double heightCm) {
        double heightM = heightCm / 100.0;
        return weight / (heightM * heightM);
    }

    public static String[] determineStatus(double[][] data) {
        String[] statuses = new String[data.length];
        for (int i = 0; i < data.length; i++) {
            double bmi = data[i][2];
            if (bmi <= 18.4) statuses[i] = "Underweight";
            else if (bmi <= 24.9) statuses[i] = "Normal";
            else if (bmi <= 39.9) statuses[i] = "Overweight";
            else statuses[i] = "Obese";
        }
        return statuses;
    }
}
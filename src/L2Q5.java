public class L2Q5 {
    public static double convertYardsToFeet(double yards) {
        double yards2feet = 3;
        return yards * yards2feet;
    }
    public static double convertFeetToYards(double feet) {
        double feet2yards = 0.333333;
        return feet * feet2yards;
    }
    public static double convertMetersToInches(double meters) {
        double meters2inches = 39.3701;
        return meters * meters2inches;
    }
    public static double convertInchesToMeters(double inches) {
        double inches2meters = 0.0254;
        return inches * inches2meters;
    }
    public static double convertInchesToCm(double inches) {
        double inches2cm = 2.54;
        return inches * inches2cm;
    }
    public static void main(String[] args) {   
        System.out.printf("10 Yards to Feet: %.2f\n", convertYardsToFeet(10));
        System.out.printf("10 Feet to Yards: %.4f\n", convertFeetToYards(10));
        System.out.printf("1 Meter to Inches: %.4f\n", convertMetersToInches(1));
        System.out.printf("36 Inches to Meters: %.4f\n", convertInchesToMeters(36));
        System.out.printf("5 Inches to Centimeters: %.2f\n", convertInchesToCm(5));
    }
}
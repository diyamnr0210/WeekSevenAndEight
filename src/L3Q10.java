import java.util.Scanner;

public class L3Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Point A (x1 y1):");
        double x1 = sc.nextDouble(), y1 = sc.nextDouble();
        System.out.println("Enter Point B (x2 y2):");
        double x2 = sc.nextDouble(), y2 = sc.nextDouble();
        System.out.println("Enter Point C (x3 y3):");
        double x3 = sc.nextDouble(), y3 = sc.nextDouble();

        System.out.println("Collinear (Slope method): " + isCollinearSlope(x1, y1, x2, y2, x3, y3));
        System.out.println("Collinear (Area method): " + isCollinearArea(x1, y1, x2, y2, x3, y3));
    }

    public static boolean isCollinearSlope(double x1, double y1, double x2, double y2, double x3, double y3) {
        double slopeAB = (y2 - y1) / (x2 - x1);
        double slopeBC = (y3 - y2) / (x3 - x2);
        double slopeAC = (y3 - y1) / (x3 - x1);

        return (slopeAB == slopeBC) && (slopeBC == slopeAC);
    }

    public static boolean isCollinearArea(double x1, double y1, double x2, double y2, double x3, double y3) {
        double area = 0.5 * ((x1 - x2) * (y2 - y3) - (x2 - x3) * (y1 - y2));
        return Math.abs(area) == 0;
    }
}
public class L2Q6 {
    public static double convertFarenheitToCelsius(double farenheit) {
        double farhenheit2celsius = (farhenheit - 32) * 5 / 9;
        return farhenheit2celsius;
    }
    public static double convertCelsiusToFarhenheit(double celsius) {
        double celsius2farhenheit = (celsius * 9 / 5) + 32;
        return celsius2farhenheit;
    }
    public static double convertPoundsToKilograms(double pounds) {
        double pounds2kilograms = 0.453592;
        return pounds * pounds2kilograms;
    }
    public static double convertKilogramsToPounds(double kilogram) {
        double kilograms2pounds = 2.20462; 
        return kilogram * kilograms2pounds;
    }
    public static double convertGallonToLitters(double gallon) {
        double gallons2liters = 3.78541;
        return gallon * gallons2liters;
    }
    public static double convertLittersToGallon(double litters) {
        double liters2gallons = 0.264172;
        return litters * liters2gallons;
    }
    public static void main(String[] args) {   
        System.out.printf("100 Farenheit To Celsius: %.2f\n", convertFarenheitToCelsius(100));
        System.out.printf("37 Celsius to Fahrenheit: %.4f\n", convertCelsiusToFarhenheit(37));
        System.out.printf("20 pounds to kilograms: %.4f\n", convertPoundsToKilograms(20));
        System.out.printf("36 kilograms to pounds: %.4f\n", convertKilogramsToPounds(36));
        System.out.printf("5 gallons to liters: %.2f\n", convertGallonToLitters(5));
        System.out.printf("18 liters to gallons: %.2f\n", convertLittersToGallon(18));
    }
}

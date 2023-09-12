import java.util.Scanner;

public class SectorAreaCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take π (pi) as a constant value
        double pi = 3.14;

        System.out.print("Enter the radius (r) of the sector: ");
        double r = scanner.nextDouble();

        System.out.print("Enter the central angle (𝛼) in degrees: ");
        double alpha = scanner.nextDouble();

        scanner.close();

        // Convert the central angle to radians
        double alphaInRadians = Math.toRadians(alpha);

        // Calculate the area of the sector
        double area = (pi * (r * r) * alphaInRadians) / 360.0;

        System.out.println("The area of the sector is: " + area);
    }
}

import java.util.Scanner;

public class CarDistance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input values
        System.out.print("Enter the initial distance between the cars (X): ");
        double X = scanner.nextDouble();
        System.out.print("Enter the distance travelled by the first car (n): ");
        double n = scanner.nextDouble();
        System.out.print("Enter the distance travelled by the second car (m): ");
        double m = scanner.nextDouble();
        System.out.print("Enter the speed of the first car (v1): ");
        double v1 = scanner.nextDouble();
        System.out.print("Enter the speed of the second car (v2): ");
        double v2 = scanner.nextDouble();

        // Calculate the time at which the second car crosses the first car
        double t = (X + n - m) / (v2 - v1);

        // Display the result
        if (t < 0) {
            System.out.println("The second car has not caught up with the first car yet.");
        } else {
            System.out.printf("The second car will catch up with the first car in %.2f hours.", t);
        }
    }
}

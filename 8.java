// quadratic equation
import java.util.Scanner;
class Roots {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a: ");
        double a = input.nextDouble();
        System.out.print("Enter b: ");
        double b = input.nextDouble();
        System.out.print("Enter c: ");
        double c = input.nextDouble();
        double result = b * b - 4 * a * c;
        if (result > 0) {
            double r1 = (-b + Math.pow(result, 0.5)) / (2 * a);
            double r2 = (-b - Math.pow(result, 0.5)) / (2 * a);
            System.out.println("The roots are " + r1 + " and " + r2);
        } else if (result == 0) {
            double r1 = -b / (2 * a);
            System.out.println("The root is " + r1);
        } else {
            System.out.println("The equation has no real roots");
        }
    }
}
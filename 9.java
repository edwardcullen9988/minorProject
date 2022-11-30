// determine greatest of three numbers
import java.util.Scanner;
class Greatest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double a = input.nextDouble();
        System.out.print("Enter second number: ");
        double b = input.nextDouble();
        System.out.print("Enter third number: ");
        double c = input.nextDouble();
        if (a > b && a > c) {
            System.out.println("The greatest number is " + a);
        } else if (b > a && b > c) {
            System.out.println("The greatest number is " + b);
        } else {
            System.out.println("The greatest number is " + c);
        }
    }
}

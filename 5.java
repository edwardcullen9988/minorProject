// convert inches into meters
import java.util.Scanner;
class InchesToMeters{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of inches");
        double inches = sc.nextDouble();
        double meters = inches*0.0254;
        System.out.println("Value of meters is "+meters);
    }
}

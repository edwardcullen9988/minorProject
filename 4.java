// convert temperature from Fahrenheit to Celsius
import java.util.Scanner;
class Temperature{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temperature in Fahrenheit");
        int fahrenheit = sc.nextInt();
        double celsius = (fahrenheit-32)*0.56;
        System.out.println("Temperature in Celsius is "+celsius);
    }
}
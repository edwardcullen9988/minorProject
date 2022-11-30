// find area of circle, triangle, rectangle and square
import java.util.Scanner;
class Area{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of circle");
        int radius = sc.nextInt();
        double area = 3.14*radius*radius;
        System.out.println("Area of circle is "+area);
        System.out.println("Enter the base of triangle");
        int base = sc.nextInt();
        System.out.println("Enter the height of triangle");
        int height = sc.nextInt();
        area = 0.5*base*height;
        System.out.println("Area of triangle is "+area);
        System.out.println("Enter the length of rectangle");
        int length = sc.nextInt();
        System.out.println("Enter the breadth of rectangle");
        int breadth = sc.nextInt();
        area = length*breadth;
        System.out.println("Area of rectangle is "+area);
        System.out.println("Enter the side of square");
        int side = sc.nextInt();
        area = side*side;
        System.out.println("Area of square is "+area);
    }
}
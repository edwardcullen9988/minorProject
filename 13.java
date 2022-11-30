// calculate average value of an array elements
import java.util.Scanner;
class ArrayAverage{
    public static void main (String[] args){
        int n,x[],sum=0;
        float avg;
        System.out.print("Enter number of elements: ");
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        x = new int[n];
        for (int i=0; i<n; i++){
            System.out.print("Enter element " + (i+1) + ": ");
            x[i] = input.nextInt();
            sum += x[i];
        }
        avg = (float)sum/n;
        System.out.println("Average of elements is " + avg);
    }
}
// sum values of single dimension array
import java.util.Scanner;
class ArraySum{
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
        System.out.println("Sum of elements is " + sum);
        avg = (float)sum/n;
        System.out.println("Average of elements is " + avg);
    }
}
// find number of days in a month with name
import java.util.Scanner;
class DaysInMonth{
    public static void main (String[] args){
        int n;
        System.out.print("Enter month number: ");
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        if (n==1){
            System.out.println("January has 31 days");
        } else if (n==2){
            System.out.println("February has 28 days");
        } else if (n==3){
            System.out.println("March has 31 days");
        } else if (n==4){
            System.out.println("April has 30 days");
        } else if (n==5){
            System.out.println("May has 31 days");
        } else if (n==6){
            System.out.println("June has 30 days");
        } else if (n==7){
            System.out.println("July has 31 days");
        } else if (n==8){
            System.out.println("August has 31 days");
        } else if (n==9){
            System.out.println("September has 30 days");
        } else if (n==10){
            System.out.println("October has 31 days");
        } else if (n==11){
            System.out.println("November has 30 days");
        } else if (n==12){
            System.out.println("December has 31 days");
        } else {
            System.out.println("Invalid month number");
        }
    }
}
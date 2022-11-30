// sort a numeric array and a string array
import java.util.Arrays;
class ArraySort{
    public static void main (String[] args){
        int[] x = {5, 2, 4, 6, 1, 3};
        String[] y = {"Zebra", "Lion", "Tiger", "Elephant", "Giraffe"};
        System.out.println("Original numeric array: " + Arrays.toString(x));
        Arrays.sort(x);
        System.out.println("Sorted numeric array: " + Arrays.toString(x));
        System.out.println("Original string array: " + Arrays.toString(y));
        Arrays.sort(y);
        System.out.println("Sorted string array: " + Arrays.toString(y));   
    }
    }

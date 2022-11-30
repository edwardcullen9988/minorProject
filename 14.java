// check if an array contains a specific value
import java.util.Arrays;
class SpecificValue{

    public static void main (String[] args){
        int[] x = {5, 2, 4, 6, 1, 3};
        int n = 4;
        System.out.println("Original numeric array: " + Arrays.toString(x));
        System.out.println("Specific value: "+n);
        getSpecificValue(x, n);

        
    }
    public static void getSpecificValue(int[] array, int specificValue){
        boolean isSpecificValue = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == specificValue) {
                isSpecificValue = true;
                break;
            }
        }
        if (isSpecificValue) {
            System.out.println("Yes, Array contains the specific value.");
        } else {
            System.out.println("No, Array does not contain the specific value.");
        }
    }
}
import java.util.Arrays;

// find index of array element
class ArrayElementIndex{
    public static int findIndex(int[] array, int t){
        if (array == null) return -1;
        int len = array.length;
        int i = 0;
        while (i < len){
            if (array[i] == t) return i;
            else i = i + 1;
        }
        return -1;
    }
    public static void main(String[] args){
        int[] my_array = {5, 4, 6, 1, 3, 2, 7, 8, 9};
        System.out.println("Array is : " + Arrays.toString(my_array));
        System.out.println("Index position of 5 is: " + findIndex(my_array, 5));
        System.out.println("Index position of 7 is: " + findIndex(my_array, 7));
    }
}

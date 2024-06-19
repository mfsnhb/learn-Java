package array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] arr = {154, 123, 32, 340, 13, 6596, 404};

        int [] origin = arr;
        int [] other = arr;
        System.out.println("Original Array: " + Arrays.toString(origin));

        // Sorting the array

        // bubbleSort(arr);
        for(int i = 0; i < arr.length - 1; i ++ ) {
            for(int j = 0; j < arr.length - i - 1; j++) {
                if(arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("Sorted Array: " + Arrays.toString(arr));
        //API
        Arrays.sort(origin);

        System.out.println("Sorted Array: " + Arrays.toString(origin));

        // 
        for(int i = 0; i < other.length - 1; i ++) { 
            for(int j = other.length - 1; j >= i + 1; j--) {
                if(other[j] > other[j - 1]) {
                    int tmp = other[j];
                    other[j] = other[j - 1];
                    other[j - 1] = tmp;
                }
            }
        }

        System.out.println("Sorted Array: " + Arrays.toString(other));
    }

}

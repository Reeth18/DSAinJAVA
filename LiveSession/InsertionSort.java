//import java.util.Arrays;
package Sorting;

public class InsertionSort {
    public static void insertion(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > current) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = current;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 20, 10, 30, 1, 5, 7 };
        insertion(arr);
        // System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

package Sorting;

import java.util.Arrays;

// Always Compare two adjacent elements in Bubble Sort
public class BubbleSort {
    static void bubbleSort(int[] arr) {
        // loop over array elements
        for (int i = 0; i < arr.length; i++) {
            // For Second Iteration where i=1, the j will also iterate from 0 to 3 that is
            // (length - i - 1)
            for (int j = 0; j < arr.length - i - 1; j++) {
                // Compare two adjacent elements arr[i] with arr[j]
                // Swap Using a Third Variable
                if (arr[j] > arr[j + 1]) {
                    int temp = 0;
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Main Method
    public static void main(String[] args) {
        // Taking the Array User Input
        int[] arr = { 5, 7, 10, 6, 4 };
        // Calling the original method
        bubbleSort(arr);
        // Printing original Array
        System.out.println(Arrays.toString(arr));
    }
}

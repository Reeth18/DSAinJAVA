package Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void selection(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;

                }

            }
            int tempVar = arr[min];
            arr[min] = arr[i];
            arr[i] = tempVar;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 20, 10, 6, 80, 3, 30, 5, 7 };
        selection(arr);
        System.out.println(Arrays.toString(arr));

    }
}

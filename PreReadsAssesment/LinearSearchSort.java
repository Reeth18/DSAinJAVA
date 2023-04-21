package Sorting;

public class LinearSearchSort {
    public static void main(String[] args) {
        int arr[] = { 64, 254, 12, 22, 11 };
        int num = arr.length;

        System.out.println("Before Sorting Array is: ");
        for (int k = 0; k < num; k++) {
            System.out.print(arr[k] + " ");
        }
        for (int i = 0; i < num - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < num; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp;
            temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }

        System.out.println();
        System.out.println();
        System.out.println("Sorted Array is: ");
        for (int k = 0; k < num; k++) {
            System.out.print(arr[k] + " ");
        }

    }
}

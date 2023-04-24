/*Sort the array elements in Ascending order */
package Sorting;

public class BubbleSort {
    public static void BubbleSort(int arr[]) {
        int num = arr.length;
        int temp = 0;
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 0, 2, 1, 2, 1 };

        System.out.println("Before Sorting the Array is: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
        System.out.println();

        BubbleSort(arr);

        System.out.println("After Sorting the Array is: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }

        System.out.println();
    }
}

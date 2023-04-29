package Searching;

public class BinarySearch {
    public static int binarySearch(int[] arr, int start, int end, int value) {
        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == value) {
                return mid;
            } else if (arr[mid] > value) {
                end = mid - 1;
                // return binarySearch(arr, start, mid -1, value);

            } else {
                start = mid + 1;
                // return binarySearch(arr, mid+1, end, value);

            }

        }
        System.out.println("Value not found");
        return -1;

    }

    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 8, 10, 12 };
        int value = 10;
        System.out.println("The value found at index: " + binarySearch(arr, 0, arr.length, value));

    }
}
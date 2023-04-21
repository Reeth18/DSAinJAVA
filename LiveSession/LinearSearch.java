package Searching;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        // Take an array
        int arr[] = { 10, 9, 4, 18, 5, 7, 2, 6 };
        int num = arr.length;

        // Enter the element which is to be searched
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Element to be Searched: ");
        int search = sc.nextInt();

        // Linear Search Algo
        int index = -1;
        for (int i = 0; i < num; i++) {
            if (arr[i] == search) {
                index = i;
                break;
            }
        }

        // Check whether it is the searched element or not
        if (index != -1) {
            System.out.println(search + " found at index " + index + ".");
        }

        else {
            System.out.println(search + " not found in the Array.");
        }

    }
}

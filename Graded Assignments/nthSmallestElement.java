package Searching;

import java.util.Arrays;

public class nthSmallestElement {
    public static int nthSmallestElement(int arrNum[], int num) {
        Arrays.sort(arrNum);
        // return arrNum[num];
        return arrNum[num - 1];
    }

    public static void main(String[] args) {
        int[] arrNum = { 15, 22, 51, 28, 13, 24, 5, 12 };

        int num = 4;
        System.out.println("N-th Smallest Element in the Array is: " + nthSmallestElement(arrNum, num));
    }
}

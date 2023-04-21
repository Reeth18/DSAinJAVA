/*Find the number of unique numbers in an Array */
package Sorting;

public class UniqueNumbers {
    static int countUniqueNumbers(int array[], int num) {
        int result = 0;
        for (int i = 0; i < num; i++) {
            int j = 0;
            for (j = 0; j < i; j++) {
                if (array[i] == array[j]) {
                    break;
                }
            }
            if (i == j) {
                result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int array[] = { 12, 10, 9, 45, 2, 10, 10, 45 };
        int num = array.length;
        System.out.println("Count of Unique Numbers: " + countUniqueNumbers(array, num));
    }
}

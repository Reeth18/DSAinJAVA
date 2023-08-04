import java.util.*;

public class singleOccurence {
    static void countSingleOccurence(int arr[], int arrSize) {

        int ans = -1;

        for (int i = 0; i < arrSize; i += 2) {
            if (arr[i] != arr[i + 1]) {
                ans = arr[i];
                break;
            }
        }

        if (arr[arrSize - 2] != arr[arrSize - 1]) {
            ans = arr[arrSize - 1];
        }

        System.out.println("The singular elements is/are: " + ans);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the No of Terms: ");
        int num = sc.nextInt();
        int[] arr = new int[num];
        System.out.println("Enter the Array Elements: ");

        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }

        countSingleOccurence(arr, num);

        sc.close();
    }
}
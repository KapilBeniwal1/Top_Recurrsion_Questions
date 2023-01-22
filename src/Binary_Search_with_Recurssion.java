/*
This code defines a BinarySearch class with a binarySearch method which takes four arguments.

1. The first argument is the array in which the element needs to be searched.
2. The second and third argument is the range of the array which needs to be searched,
   initially it is set to 0 and n-1 where n is the size of the array
3. The fourth argument is the element that needs to be searched.

The method uses recursion to repeatedly divide the array in half and check if the middle
element is the desired value. If it is, it returns the index of the middle element. If the
middle element is greater than the desired value, it calls itself with the left half of the
array. If the middle element is less than the desired value, it calls itself with the right
half of the array.
 */
import java.util.Scanner;
public class Binary_Search_with_Recurssion {
    public static int binarySearch(int[] arr, int low, int high, int x) {
        if (high >= low) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == x) {
                return mid;
            }
            if (arr[mid] > x) {
                return binarySearch(arr, low, mid - 1, x);
            }
            return binarySearch(arr, mid + 1, high, x);
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("size of array :");
        int n =sc.nextInt();
        System.out.println("array elements :");
        int[] arr = new int[n];
        for (int i=0 ; i<n ; i++)
            arr[i] = sc.nextInt();
        System.out.println("Number to find : ");
        int x = sc.nextInt();
        int result = binarySearch(arr, 0, n - 1, x);
        if (result == -1) {
            System.out.println("Element not present");
        } else {
            System.out.println("Element found at index " + result);
        }
    }
}


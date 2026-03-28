package day3;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        // Step 1: two pointers
        int left = 0;                 // start index
        int right = arr.length - 1;   // last index

        // Step 2: swap till middle
        while (left < right) {

            // Step 3: swapping elements
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            // Step 4: move pointers
            left++;
            right--;
        }

        // Step 5: print array
        System.out.println("Reversed Array: " + Arrays.toString(arr));
    }
}
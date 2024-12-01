package Day11;

import java.util.Arrays;

public class RearrangeArray {
    public static void main(String[] args) {
        int[] arr = {10, 76, 34, 86, 65, 55, 90, 23, 45};

        // Step 1: Sort the array in ascending order
        Arrays.sort(arr);

        // Step 2: Create a new array to store the result
        int[] result = new int[arr.length];
        int n = arr.length;

        // Step 3: Fill the first half in increasing order and the second half in decreasing order
        int i = 0, j = n - 1; // Pointers for smallest and largest elements
        for (int k = 0; k < n; k++) {
            if (k < n / 2) {
                result[k] = arr[i++];
            } else {
                result[k] = arr[j--];
            }
        }

        // Print the rearranged array
        System.out.println("Rearranged Array (Increasing-Decreasing Order):");
        System.out.println(Arrays.toString(result));
    }
}


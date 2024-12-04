package Day15;

import java.util.Arrays;

public class MedianOfGivenArray {

	public static void main(String[] args) {
		int[] arr = {10, 76, 34, 86, 65, 89, 23, 45};
		
		Arrays.sort(arr);
		double median;
		int n = arr.length;
		
		if(n%2==0) {
			 median = (arr[n / 2 - 1] + arr[n / 2]) / 2.0;
		}else {
            // Odd number of elements: Middle element
            median = arr[n / 2];
        }

        // Print the sorted array and the median
        System.out.println("Sorted Array: " + Arrays.toString(arr));
        System.out.println("Median: " + median);
		
	}
}

package Day12;

import java.util.Arrays;

public class SumOfArray {

	public static void main(String[] args) {
		int[] arr = {10, 76, 34, 86, 65, 89, 23, 45};
		
		//Approach 1
		int sumOfArray = 0;
		for (int i = 0; i < arr.length; i++) {
			sumOfArray += arr[i];
		}
		System.out.println("Sum of array is : "+sumOfArray);
		
		//Approach 2
		int sumOfArray2 = Arrays.stream(arr).sum();
		System.out.println("Sum of array is : "+sumOfArray2);
		
	}
}

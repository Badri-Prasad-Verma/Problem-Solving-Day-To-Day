package Day7;

import java.util.Arrays;

public class FindTheLargestFromArray {
	
	public static void main(String[] args) {
		int[] arr= {10,76,34,10,86,65,34,89,65};
		
		//Approach 1
		int max = arr[0];
		for (int i = 0; i < arr.length-1; i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println("Largest Number is : "+max);
		
		//Approach 2
		Arrays.sort(arr);
		int largest = arr[arr.length-1];
		System.out.println("Largest Number is : "+largest);
		
	}

}

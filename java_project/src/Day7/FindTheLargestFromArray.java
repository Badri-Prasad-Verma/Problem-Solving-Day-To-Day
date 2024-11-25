package Day7;

import java.util.Arrays;

public class FindTheLargestFromArray {
	
	public static void main(String[] args) {
		int[] arr= {10,76,34,10,86,65,34,89,65};
		
		//Approach 1
		int largest = arr[0];
		for (int i = 0; i < arr.length-1; i++) {
			if(arr[i]>largest) {
				largest=arr[i];
			}
		}
		System.out.println("Largest Number is : "+largest);
		
		//Approach 2
        int largest1 = Arrays.stream(arr).max().orElseThrow(null);
        System.out.println("Largest Number is : "+largest1);
        
		//Approach 3
		Arrays.sort(arr);
		int largest2 = arr[arr.length-1];
		System.out.println("Largest Number is : "+largest2);
		
	}

}

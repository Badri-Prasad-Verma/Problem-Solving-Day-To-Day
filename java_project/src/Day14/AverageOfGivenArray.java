package Day14;

import java.util.Arrays;

public class AverageOfGivenArray {

	public static void main(String[] args) {
	
		int[] arr = {10, 76, 34, 86, 65, 89, 23, 45};
		
		//Approach 1 
		int sum =0;
		for (int num : arr) {
			sum+=num;
		}
		
		double average = (double) sum/ arr.length;
		System.out.println("Average of all numbers is : "+average);
		
		//Approach 2 using java 8
		double average1 = Arrays.stream(arr).average().orElse(0.0);
		System.out.println("Average of all numbers is : "+average1);
		
		
	}
	
}

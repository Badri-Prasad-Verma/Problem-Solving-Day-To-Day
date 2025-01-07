package Day23;

import java.util.Arrays;

public class CountAllNumbers {

	public static void main(String[] args) {
		int[] arr= {1,9,2,8,3,7,4,6};
		
		//Approach 1
		int count=0;
		for (int i = 0; i < arr.length; i++) {
			count++;
		}
		System.out.println(count);
		
		//Approach 2 using java 8
		Long countNum = Arrays.stream(arr).count();
		System.out.println(countNum);
	}
}

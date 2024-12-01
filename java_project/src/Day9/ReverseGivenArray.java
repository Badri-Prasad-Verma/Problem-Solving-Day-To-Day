package Day9;

import java.util.Arrays;
import java.util.Comparator;
public class ReverseGivenArray {

	public static void main(String[] args) {
		int[] arr= {55,11,99,33,77,44,88,22,66};
		
		//Approach 1 using collection
		Arrays.stream(arr).boxed()
		.sorted(Comparator.comparing(Integer::intValue).reversed())
		.forEach(e->System.out.print(e+" "));
		System.out.println();
		
		//Approach 2 using for loop
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr.length-1; j++) {
				if(arr[j]<arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}

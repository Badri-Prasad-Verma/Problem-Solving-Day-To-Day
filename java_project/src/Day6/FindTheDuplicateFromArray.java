package Day6;

import java.util.Arrays;
import java.util.stream.Collectors;

public class FindTheDuplicateFromArray {

	public static void main(String[] args) {
		int[] arr= {10,76,34,10,86,65,34,89,65};
		
		//Approach 1 using loop
		Arrays.sort(arr);
		for (int i = 0; i < arr.length-1; i++) {
			if(arr[i]==arr[i+1]) {
				System.out.println(arr[i]);
			}
		}
		
		//Approach 2 using Stream API
		Arrays.stream(arr).boxed()
		.collect(Collectors.groupingBy(i->i,Collectors.counting()))
		.entrySet().stream().filter(e->e.getValue()>1)
		.map(e->e.getKey()).collect(Collectors.toList())
		.forEach(e->System.out.println(e));
		
	}

}

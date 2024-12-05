package Day18;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class AllRepeatedNumber {

	public static void main(String[] args) {
		int[] arr = {4, 3, 2, 7, 8, 2, 3, 1, 4};
		 
		// Approach 1 using collection
		HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
		for (int num : arr) {
			map.put(num, map.getOrDefault(num, 0)+1);
		}
		System.out.println("All Repeated Numbers : ");
		for (Entry<Integer, Integer> entrySet : map.entrySet()) {
			if(entrySet.getValue() > 1) {
				System.out.print(entrySet.getKey()+" ");
			}
		}
		System.out.println();
		
		//Approach 2 using loop
		Arrays.sort(arr);
		System.out.println("All Repeated Numbers : ");
		for (int i = 1; i < arr.length; i++) {
			if(arr[i]==arr[i-1]) {
				System.out.print(arr[i]+" ");
			}
		}
		System.out.println();
		
		//Approach 3 using java8
		System.out.println("All Repeated Numbers : ");
		Arrays.stream(arr).boxed()
		.collect(Collectors.groupingBy(e->e, Collectors.counting()))
		.entrySet().stream()
		.filter(e -> e.getValue()>1)
		.forEach(e->System.out.print(e.getKey()+" "));
		
	}
}

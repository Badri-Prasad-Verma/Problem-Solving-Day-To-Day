package Day10;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class CountFrequencyOfArray {

	public static void main(String[] args) {
		int[] arr = { 55, 11, 22, 33, 55, 44, 88, 22, 11, 77 };

		// Approach 1 using collection
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int num : arr) {
			map.put(num, map.getOrDefault(num, 0) + 1);
		}
		for (Entry<Integer, Integer> frequency : map.entrySet()) {
			System.out.println(frequency.getKey() + " = " + frequency.getValue());
		}

		//Approach 2 using Java8
		Map<Integer, Long> collect = Arrays.stream(arr)
		.boxed()
		.collect(Collectors.groupingBy(e->e,LinkedHashMap::new,Collectors.counting()));
		System.out.println(collect);

		// Approach 3 using loop
		int number = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == number) {
				continue;
			}
			int count = 1;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
					arr[j] = number;
				}
			}
			System.out.println("Element : " + arr[i] + " frequencies : " + count);
		}
	}
}

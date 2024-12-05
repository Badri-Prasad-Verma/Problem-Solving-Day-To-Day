package Day17;

import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.IntStream;

public class RemoveDuplicatesFromUnsortedArray {

	public static void main(String[] args) {

		//Approach 1 using loop and recursion/
		 int[] arr = {4, 3, 2, 7, 8, 2, 3, 1};
		 
		 HashSet<Integer> hashSet = new HashSet<Integer>();
			
			for (Integer integer : arr) {
				hashSet.add(integer);
			}
			
			int[] uniqueArray =new int[hashSet.size()];
			int i=0;
			
			for (int num : hashSet) {
				uniqueArray[i++] = num;
			}
			
	        System.out.println("Array after removing duplicates: " + Arrays.toString(uniqueArray));

	        //Approach 2 using java8
	        
	        int[] array = IntStream.of(arr).distinct().toArray();
	        System.out.println(Arrays.toString(array));
		 
	}
	
}

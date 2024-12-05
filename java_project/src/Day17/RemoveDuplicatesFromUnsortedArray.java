package Day17;

import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicatesFromUnsortedArray {

	public static void main(String[] args) {

		 int[] arr = {4, 3, 2, 7, 8, 2, 3, 1};
		 
		 int[] uniqueArray = removeDuplicate(arr);
	     System.out.println("Array after removing duplicates: " + Arrays.toString(uniqueArray));

		 
	}

	private static int[] removeDuplicate(int[] arr) {
		HashSet<Integer> hashSet = new HashSet<Integer>();
		
		for (Integer integer : arr) {
			hashSet.add(integer);
		}
		
		int[] unique =new int[hashSet.size()];
		int i=0;
		
		for (int num : hashSet) {
			unique[i++] = num;
		}
		
		return unique;
	}
}

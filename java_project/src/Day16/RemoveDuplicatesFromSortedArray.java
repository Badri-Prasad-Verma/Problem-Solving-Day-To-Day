package Day16;

public class RemoveDuplicatesFromSortedArray {

	public static void main(String[] args) {
		//Time Complexity: O(n)
		//Space Complexity : O(n)
		int[] arr = {1, 1, 2, 2, 3, 4, 4, 5, 6, 6};
		
		int newLength = removeDuplicates(arr);
		
		System.out.print("Array after removing duplicates: ");
		for (int i = 0; i < newLength; i++) {
			System.out.print(arr[i]+" ");
		}
		
	}

	private static int removeDuplicates(int[] arr) {
		if(arr.length==0) {
			return 0;
		}
		
		int uniqueIndex = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] != arr[uniqueIndex]) {
				uniqueIndex++;
				arr[uniqueIndex] = arr[i];
			}
		}
		
		return uniqueIndex+1;
	}
}

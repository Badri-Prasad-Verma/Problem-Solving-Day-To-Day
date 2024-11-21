package Day3;

import java.util.ArrayList;
import java.util.List;

public class AddGivenTwoArray {
	public static void main(String[] args) {
		
		int[] arr1= {1,2,3,4};
		int[] arr2= {5,6,7,8};
		
		int[] addedArray=new int[arr1.length+arr2.length];
		
		//Approach 1 -> using loop
		for (int i = 0; i < arr1.length; i++) {
			addedArray[i]=arr1[i];
		}
		for (int i = 0; i < arr2.length; i++) {
			addedArray[arr1.length+i]=arr2[i];
		}
		for (int i = 0; i < addedArray.length; i++) {
			System.out.print(addedArray[i]+" ");
		}
		
		System.out.println();
		
		//Approach 2 -> using collection
		List<Integer> list=new ArrayList<Integer>();
		for (int i = 0; i < arr1.length; i++) {
			list.add(arr1[i]);
		}
		for (int i = 0; i < arr2.length; i++) {
			list.add(arr2[i]);
		}
		System.out.println(list);
		
	}
}

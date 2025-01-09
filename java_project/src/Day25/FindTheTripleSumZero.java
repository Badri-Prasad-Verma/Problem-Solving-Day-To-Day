package Day25;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindTheTripleSumZero {

	public static void main(String[] args) {
		int[] nums = {-1, 0, 1, 2, -1, -4};
		List<List<Integer>> tripeSum = findTripleSumZero(nums);
		for (List<Integer> list : tripeSum) {
			System.out.println(list);
		}
	}

	private static List<List<Integer>> findTripleSumZero(int[] nums) {
		List<List<Integer>> tripeSumZero = new ArrayList<List<Integer>>();
		for (int i = 0; i < nums.length; i++) {
			for (int j = i+1; j < nums.length; j++) {
				for (int k = j+1; k < nums.length; k++) {
					if(nums[i]+nums[j]+nums[k]==0) {
						tripeSumZero.add(Arrays.asList(i,j,k));
					}
				}
			}
		}
		
		return tripeSumZero;
	}
}
